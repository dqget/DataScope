package com.hole.hs.utils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheUtils {
    private static final Map<String, Object> cache = new ConcurrentHashMap<>();

    public static void hmset(String key, Map<?, ?> map) {
        cache.put(key, map);
    }


}
