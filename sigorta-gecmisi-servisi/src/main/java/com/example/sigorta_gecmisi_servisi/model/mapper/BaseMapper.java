package com.example.sigorta_gecmisi_servisi.model.mapper;

import java.util.Collection;
import java.util.List;

public interface BaseMapper<S, T> {

    T map(S source);

    List<T> map(Collection<S> sources);

}

