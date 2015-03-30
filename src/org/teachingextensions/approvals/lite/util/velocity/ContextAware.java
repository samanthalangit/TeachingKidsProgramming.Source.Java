package org.teachingextensions.approvals.lite.util.velocity;

import org.apache.velocity.context.Context;

import java.util.HashMap;
import java.util.Map.Entry;

public interface ContextAware {
    public void setupContext(Context context);

    public static class ContextAwareMap implements ContextAware {
        HashMap<String, Object> add = new HashMap<>();

        public ContextAwareMap(String key, Object object) {
            put(key, object);
        }

        public void put(String key, Object object) {
            add.put(key, object);
        }

        public void setupContext(Context context) {
            for (Entry<String, Object> entry : add.entrySet()) {
                context.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
