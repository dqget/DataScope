package com.hole.hs.utils;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BeanMapperUtils {

    private BeanMapperUtils() {
    }

    private static final Mapper MAPPER = DozerBeanMapperBuilder.buildDefault();

    public static <T> T map(Object source, Class<T> destinationClass) {
        return MAPPER.map(source, destinationClass);
    }

    public static <T> List<T> mapList(Collection<?> sourceList, Class<T> destinationClass) {
        List<T> destinationList = new ArrayList<>(sourceList.size());
        for (Object sourceObject : sourceList) {
            T destinationObject = MAPPER.map(sourceObject, destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }

    public static <T> T copy(Object source, T destinationObject) {
        MAPPER.map(source, destinationObject);
        return destinationObject;
    }

}
