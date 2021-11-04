package com.musikada.user.util;

public interface Convertible<Entity, Dto> {

	Dto ToDTO(Entity entity);
	
	Entity ToEntity(Dto dto);
}
