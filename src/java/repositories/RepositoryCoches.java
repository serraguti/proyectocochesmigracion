package repositories;

import java.util.List;
import models.Coches;
import models.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RepositoryCoches {

    Session session;
    Transaction transaction;

    public RepositoryCoches() {
        this.session = HibernateUtil.getSessionFactory().getCurrentSession();
    }

    private void iniciarTransaccion() {
        if (this.session.isOpen() == false) {
            this.session = HibernateUtil.getSessionFactory().getCurrentSession();
        }
        this.transaction = this.session.beginTransaction();
    }

    public List<Coches> getCoches() {
        this.iniciarTransaccion();
        String hql = "from Coches as c";
        Query query = this.session.createQuery(hql);
        List<Coches> coches = query.list();
        this.session.close();
        return coches;
    }
}
