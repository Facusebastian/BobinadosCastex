/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bobinadoscastex.persistencia;

import com.mycompany.bobinadoscastex.logica.Motor;
import com.mycompany.bobinadoscastex.persistencia.exceptions.NonexistentEntityException;
import com.mycompany.bobinadoscastex.persistencia.exceptions.PreexistingEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author PC
 */
public class MotorJpaController implements Serializable {

    public MotorJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
     public MotorJpaController() {
        this.emf = Persistence.createEntityManagerFactory("BobininadosUP");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Motor motor) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(motor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMotor(motor.getIdMotor()) != null) {
                throw new PreexistingEntityException("Motor " + motor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Motor motor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            motor = em.merge(motor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = motor.getIdMotor();
                if (findMotor(id) == null) {
                    throw new NonexistentEntityException("The motor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Motor motor;
            try {
                motor = em.getReference(Motor.class, id);
                motor.getIdMotor();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The motor with id " + id + " no longer exists.", enfe);
            }
            em.remove(motor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Motor> findMotorEntities() {
        return findMotorEntities(true, -1, -1);
    }

    public List<Motor> findMotorEntities(int maxResults, int firstResult) {
        return findMotorEntities(false, maxResults, firstResult);
    }

    private List<Motor> findMotorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Motor.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Motor findMotor(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Motor.class, id);
        } finally {
            em.close();
        }
    }

    public int getMotorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Motor> rt = cq.from(Motor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
