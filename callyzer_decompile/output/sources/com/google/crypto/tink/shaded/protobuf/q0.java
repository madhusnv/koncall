package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public final class q0 {
    /* renamed from: a */
    public static void m4367a(Object obj, Object obj2) {
        p0 p0Var = (p0) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (p0Var.isEmpty()) {
            return;
        }
        Iterator it = p0Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* renamed from: b */
    public static p0 m4368b(Object obj, Object obj2) {
        p0 p0VarM4365f = (p0) obj;
        p0 p0Var = (p0) obj2;
        if (!p0Var.isEmpty()) {
            if (!p0VarM4365f.f7086a) {
                p0VarM4365f = p0VarM4365f.m4365f();
            }
            p0VarM4365f.m4364d();
            if (!p0Var.isEmpty()) {
                p0VarM4365f.putAll(p0Var);
            }
        }
        return p0VarM4365f;
    }
}
