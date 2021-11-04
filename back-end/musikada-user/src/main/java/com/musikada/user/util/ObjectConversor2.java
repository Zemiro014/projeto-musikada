package com.musikada.user.util;

public interface ObjectConversor2<Entity, Dto> {	
	Convertible<Entity, Dto> convert();
}	
