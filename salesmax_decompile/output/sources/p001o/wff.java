package p001o;

import java.util.List;

/* loaded from: classes6.dex */
public abstract class wff {
    public wff() {
    }

    public /* synthetic */ wff(id5 id5Var) {
        this();
    }

    /* renamed from: c */
    public static /* synthetic */ dc9 m54336c(wff wffVar, ob9 ob9Var, List list, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i & 2) != 0) {
            list = ch3.m21246k();
        }
        return wffVar.mo21128b(ob9Var, list);
    }

    /* renamed from: a */
    public abstract void mo21127a(yff yffVar);

    /* renamed from: b */
    public abstract dc9 mo21128b(ob9 ob9Var, List list);

    /* renamed from: d */
    public abstract bn5 mo21129d(ob9 ob9Var, String str);

    /* renamed from: e */
    public abstract iff mo21130e(ob9 ob9Var, Object obj);
}
