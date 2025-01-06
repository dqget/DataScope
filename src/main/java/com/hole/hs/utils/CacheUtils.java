package com.hole.hs.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheUtils {
    private static final Map<String, Object> cache = new ConcurrentHashMap<>();

    public static void hset(String key, Map<?, ?> map) {
        cache.put(key, map);
    }

    @SuppressWarnings("unchecked")
    public static void hmset(String key, Map<?, ?> map) {
        if (cache.containsKey(key)) {
            Object o = cache.get(key);
            Map<String, Object> oldMap = (Map<String, Object>) o;
            oldMap.putAll((Map<String, Object>) map);
            return;
        }
        cache.put(key, map);
    }

}
