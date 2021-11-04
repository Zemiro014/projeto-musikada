package com.musikada.user.services;

//@Service
//public class GenericService<T extends Convertible<T>, DTO, ID> {
//
//	@Autowired
//	private JpaRepository<T, ID> repository;
//
//	@SuppressWarnings("unchecked")
//	public DTO findById(ID id) {
//		Optional<T> result = repository.findById(id);
//		return (DTO) result.get().convert();
//	}
//
//	public List<DTO> findAll() {
//		List<T> list = repository.findAll();
//		@SuppressWarnings("unchecked")
//		List<DTO> resultDTO = (List<DTO>) list.stream().map(x -> x.convert()).collect(Collectors.toList());
//		return resultDTO;
//	}
//}
