package com.pluralsight.jacket.entry.service;

import java.util.LinkedList;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.pluralsight.jacket.entry.exceptions.JacketException;
import org.apache.commons.logging.Log;
import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.jacket.entry.data.models.Entry;
import com.pluralsight.jacket.entry.repository.EntryRepository;
import com.pluralsight.jacket.entry.service.models.JacketEntry;

@Named
@Transactional(readOnly = true)
public class EntryRepositoryEntryDetailsService implements JacketEntryService {

	EntryRepository repository;
	Log log;
<<<<<<< HEAD
	
=======

>>>>>>> release/sprint1-release
    @Inject
    public EntryRepositoryEntryDetailsService(EntryRepository repository, Log log) {
    	this.repository = repository;
    	this.log = log;
    }


    @Override
    public List<JacketEntry> getAllEntries() {
    	Iterable<Entry> entries = repository.findAll();
<<<<<<< HEAD
    	List<JacketEntry> serviceEntries = new LinkedList<JacketEntry>(); 
=======
    	List<JacketEntry> serviceEntries = new LinkedList<JacketEntry>();
>>>>>>> release/sprint1-release
    	if(entries != null)
    	{
    		entries.forEach(e -> serviceEntries.add(new JacketEntry(e.getUrl())));
    	}
    	else
    	{
    		log.debug("*********** repository return null");
    	}
    	return serviceEntries;
    }

	@Override
	public JacketEntry getEntry(long id) {
		JacketEntry jacketEntry;
		try {
			Entry entry = repository.findOne(id);
			jacketEntry = new JacketEntry(entry.getUrl());

		} catch (Exception ex) {
<<<<<<< HEAD
<<<<<<< HEAD
=======
            log.debug(ex);
>>>>>>> sprint1-release
=======
      log.debug(ex);
>>>>>>> release/sprint1-release
			throw new JacketException("Unable to find entry", ex);
		}
 		return jacketEntry;
	}


	@Override
	@Transactional(readOnly = false)
	public void updateEntry(JacketEntry e) {
<<<<<<< HEAD
		
	}
}

=======

	}
}
>>>>>>> release/sprint1-release
