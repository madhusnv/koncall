package p001o;

import p001o.q74;

/* loaded from: classes6.dex */
public final class qkh implements q74.InterfaceC16312c {

    /* renamed from: a */
    public final ThreadLocal f42104a;

    public qkh(ThreadLocal threadLocal) {
        this.f42104a = threadLocal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qkh) && sq8.m48644c(this.f42104a, ((qkh) obj).f42104a);
    }

    public int hashCode() {
        return this.f42104a.hashCode();
    }

    public String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f42104a + ')';
    }
}
