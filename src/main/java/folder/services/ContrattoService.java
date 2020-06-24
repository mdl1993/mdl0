package folder.services;

import java.util.List;
import folder.domain.Contratto;
import folder.domain.TipoContratto;
import folder.services.exceptions.ServiceException;

public interface ContrattoService {

	public List<Contratto> getListaContratti() throws ServiceException;

	public Contratto getContratto(Integer id) throws ServiceException;

	public Integer insert(Contratto contratto) throws ServiceException;

	public void update(Contratto contratto) throws ServiceException;

	public void delete(Integer id) throws ServiceException;

	public List<TipoContratto> caricaTipi() throws ServiceException;

}
