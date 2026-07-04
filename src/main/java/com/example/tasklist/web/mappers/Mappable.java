package com.example.tasklist.web.mappers;

import java.util.List;

public interface Mappable<D, E>
{
    D toDto(E entity);

    List<D> toDto(List<E> entities);

    E toEntity(D dto);

    List<E> toEntity(List<D> dtos);
}
