package folder.services;

import java.util.List;
import folder.domain.Anagrafica;
import folder.domain.Provincia;
import folder.services.exceptions.ServiceException;

public interface ManagerService {
    public List<Anagrafica> getListaAnagrafica() throws ServiceException;
    public Anagrafica getAnagrafica(Integer id) throws ServiceException;
    public Integer insert(Anagrafica anagrafica) throws ServiceException;
    public void update(Anagrafica anagrafica) throws ServiceException;
    public void delete(Integer id) throws ServiceException;
public List<Provincia> caricaProvince() throws ServiceException;
}