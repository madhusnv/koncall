package p001o;

import java.util.Collections;
import java.util.Map;
import p001o.vn7;

/* loaded from: classes4.dex */
public class pp6 {

    /* renamed from: b */
    public static boolean f40367b = true;

    /* renamed from: c */
    public static volatile pp6 f40368c;

    /* renamed from: d */
    public static final pp6 f40369d = new pp6(true);

    /* renamed from: a */
    public final Map f40370a = Collections.emptyMap();

    /* renamed from: o.pp6$a */
    public static final class C16154a {

        /* renamed from: a */
        public final Object f40371a;

        /* renamed from: b */
        public final int f40372b;

        public C16154a(Object obj, int i) {
            this.f40371a = obj;
            this.f40372b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C16154a)) {
                return false;
            }
            C16154a c16154a = (C16154a) obj;
            return this.f40371a == c16154a.f40371a && this.f40372b == c16154a.f40372b;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f40371a) * 65535) + this.f40372b;
        }
    }

    public pp6(boolean z) {
    }

    /* renamed from: b */
    public static pp6 m44004b() {
        pp6 pp6VarM42534a = f40368c;
        if (pp6VarM42534a == null) {
            synchronized (pp6.class) {
                pp6VarM42534a = f40368c;
                if (pp6VarM42534a == null) {
                    pp6VarM42534a = f40367b ? op6.m42534a() : f40369d;
                    f40368c = pp6VarM42534a;
                }
            }
        }
        return pp6VarM42534a;
    }

    /* renamed from: a */
    public vn7.C17623c m44005a(rcb rcbVar, int i) {
        tq.m50332a(this.f40370a.get(new C16154a(rcbVar, i)));
        return null;
    }
}
