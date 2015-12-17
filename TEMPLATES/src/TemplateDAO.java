package co.edu.eafit.core.application.model.dao.hibernate;


import co.edu.eafit.core.application.bo.Maestro;
import co.edu.eafit.core.application.bo.Tabla;
import co.edu.eafit.core.application.model.dao.IMaestroDAO;
import co.edu.eafit.core.util.context.ContextUtil;
import co.edu.eafit.core.util.database.hibernate.HibernateBaseDAO;

import java.lang.reflect.Field;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.type.LongType;


public class MaestroDAO extends HibernateBaseDAO implements IMaestroDAO {
    public MaestroDAO() {
        super();
    }

    @Override
    public List<Maestro> listarMaestros(String codeApp) {
        Query q = getSession().getNamedQuery("Maestro.findByAppCode").setParameter("codeApp", codeApp);
        return q.list();
    }

    @Override
    public List<Tabla> findyByMaestroNombre(String maestroCodigo) {
        Query q = getSession().getNamedQuery("Tabla.findyByMaestroNombre").setParameter(0, maestroCodigo);
        return q.list();
    }

    public <T extends Tabla> List<T> findByMaestroCodigoGenerics(Class<T> clazz) throws Exception {
        try {
            Field f = clazz.getField("CODIGO_MAESTRO");

            Query q = getSession().getNamedQuery("Tabla.findByMaestroCodigo").setParameter(0, f.get(null).toString());
            List<Tabla> listaObjetos = q.list();
            List<T> listaConcreta = new ArrayList<T>();
            for (Tabla tab : listaObjetos) {
                T tipoConcreto = (T)clazz.newInstance();
                tipoConcreto.setCodigoAlterno(tab.getCodigoAlterno());
                tipoConcreto.setDescripcion(tab.getDescripcion());
                tipoConcreto.setCodigo(tab.getCodigo());
                tipoConcreto.setEstado(tab.getEstado());
                listaConcreta.add(tipoConcreto);
            }
            return listaConcreta;


        } catch (NoSuchFieldException e) {
            throw new Exception(String.format("La clase %s no tiene el atributo CODIGO_MAESTRO definido",clazz.getCanonicalName()));
            
            
        } catch (Exception e) {
            throw e;
        }
    }


    @Override
    public List<Tabla> listarTablas(String maestroCodigo) {
        Query q = getSession().getNamedQuery("Tabla.findByMaestroCodigo").setParameter(0, maestroCodigo);
        return q.list();
    }
    
    @Override
    public List<Tabla> listarTablasTodos(String maestroCodigo) {
        Query q = getSession().getNamedQuery("Tabla.findByMaestroCodigoTodos").setParameter(0, maestroCodigo);
        return q.list();
    }

    @Override
    public void guardarGenerico(Object o) {
        getSession().saveOrUpdate(o);
    }

    @Override
    public Long getNextIdTabla() {
        Query q =
            getSession().createSQLQuery("select max(TIP_CODIGOREG)+1 siguiente from cit_tablas").addScalar("siguiente",
                                                                                                           LongType.INSTANCE);
        Long ultimoId = (Long)q.uniqueResult();
        return ultimoId;
    }

    @Override
    public void eliminarGenerico(Object o) {
        getSession().delete(o);

    }
}
