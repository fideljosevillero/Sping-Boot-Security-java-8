package com.fideljose.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.fideljose.model.Client;
import com.fideljose.repository.IClientRepository;

@Service
public class ClientService implements IClientRepository {

	@Autowired
	IClientRepository repository;

	@Override
	public List<Client> findAll() {
		return repository.findAll();
	}

	@Override
	public List<Client> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	@Override
	public List<Client> findAllById(Iterable<Integer> ids) {
		return repository.findAllById(ids);
	}

	@Override
	public <S extends Client> List<S> saveAll(Iterable<S> entities) {
		return repository.saveAll(entities);
	}

	@Override
	public void flush() {
		repository.flush();
	}

	@Override
	public <S extends Client> S saveAndFlush(S entity) {
		return repository.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<Client> entities) {
		repository.deleteAllInBatch();
	}

	@Override
	public void deleteAllInBatch() {
		repository.deleteAllInBatch();
	}

	@Override
	public Client getOne(Integer id) {
		return repository.getOne(id);
	}

	@Override
	public <S extends Client> List<S> findAll(Example<S> example) {
		return repository.findAll(example);
	}

	@Override
	public <S extends Client> List<S> findAll(Example<S> example, Sort sort) {
		return repository.findAll(example, sort);
	}

	@Override
	public Page<Client> findAll(Pageable pageable) {
		return repository.findAll(pageable);
	}

	@Override
	//public <S extends Client> S save(S entity) {
	public <S extends Client> S save(S entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Client> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return repository.existsById(id);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(Client entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteAll(Iterable<? extends Client> entities) {
		repository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	@Override
	public <S extends Client> Optional<S> findOne(Example<S> example) {
		return repository.findOne(example);
	}

	@Override
	public <S extends Client> Page<S> findAll(Example<S> example, Pageable pageable) {
		return repository.findAll(example, pageable);
	}

	@Override
	public <S extends Client> long count(Example<S> example) {
		return repository.count(example);
	}

	@Override
	public <S extends Client> boolean exists(Example<S> example) {
		return repository.exists(example);
	}
	
}
