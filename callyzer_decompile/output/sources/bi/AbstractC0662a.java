package bi;

import ai.AbstractC0159p;
import ai.InterfaceC0144a;
import fi.AbstractC2291b;
import hi.C2943k;
import hi.C2955w;
import hi.d0;
import hi.g2;
import hi.j0;
import hi.l2;
import hi.q2;
import hi.t2;
import hi.u0;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p020v.a1;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: bi.a */
/* loaded from: classes.dex */
public abstract class AbstractC0662a {
    static {
        C0665d[] c0665dArr = {new C0665d(InterfaceC0144a.class, 0)};
        HashMap map = new HashMap();
        C0665d c0665d = c0665dArr[0];
        Class cls = c0665d.f4217a;
        if (map.containsKey(cls)) {
            throw new IllegalArgumentException(a1.m14329i(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map.put(cls, c0665d);
        Class cls2 = c0665dArr[0].f4217a;
        Collections.unmodifiableMap(map);
        C0665d[] c0665dArr2 = {new C0665d(InterfaceC0144a.class, 3)};
        HashMap map2 = new HashMap();
        C0665d c0665d2 = c0665dArr2[0];
        Class cls3 = c0665d2.f4217a;
        if (map2.containsKey(cls3)) {
            throw new IllegalArgumentException(a1.m14329i(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map2.put(cls3, c0665d2);
        Class cls4 = c0665dArr2[0].f4217a;
        Collections.unmodifiableMap(map2);
        C0665d[] c0665dArr3 = {new C0665d(InterfaceC0144a.class, 4)};
        HashMap map3 = new HashMap();
        C0665d c0665d3 = c0665dArr3[0];
        Class cls5 = c0665d3.f4217a;
        if (map3.containsKey(cls5)) {
            throw new IllegalArgumentException(a1.m14329i(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map3.put(cls5, c0665d3);
        Class cls6 = c0665dArr3[0].f4217a;
        Collections.unmodifiableMap(map3);
        C0665d[] c0665dArr4 = {new C0665d(InterfaceC0144a.class, 2)};
        HashMap map4 = new HashMap();
        C0665d c0665d4 = c0665dArr4[0];
        Class cls7 = c0665d4.f4217a;
        if (map4.containsKey(cls7)) {
            throw new IllegalArgumentException(a1.m14329i(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map4.put(cls7, c0665d4);
        Class cls8 = c0665dArr4[0].f4217a;
        Collections.unmodifiableMap(map4);
        C0665d[] c0665dArr5 = {new C0665d(InterfaceC0144a.class, 6)};
        HashMap map5 = new HashMap();
        C0665d c0665d5 = c0665dArr5[0];
        Class cls9 = c0665d5.f4217a;
        if (map5.containsKey(cls9)) {
            throw new IllegalArgumentException(a1.m14329i(cls9, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map5.put(cls9, c0665d5);
        Class cls10 = c0665dArr5[0].f4217a;
        Collections.unmodifiableMap(map5);
        C0665d[] c0665dArr6 = {new C0665d(InterfaceC0144a.class, 7)};
        HashMap map6 = new HashMap();
        C0665d c0665d6 = c0665dArr6[0];
        Class cls11 = c0665d6.f4217a;
        if (map6.containsKey(cls11)) {
            throw new IllegalArgumentException(a1.m14329i(cls11, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map6.put(cls11, c0665d6);
        Class cls12 = c0665dArr6[0].f4217a;
        Collections.unmodifiableMap(map6);
        C0665d[] c0665dArr7 = {new C0665d(InterfaceC0144a.class, 5)};
        HashMap map7 = new HashMap();
        C0665d c0665d7 = c0665dArr7[0];
        Class cls13 = c0665d7.f4217a;
        if (map7.containsKey(cls13)) {
            throw new IllegalArgumentException(a1.m14329i(cls13, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map7.put(cls13, c0665d7);
        Class cls14 = c0665dArr7[0].f4217a;
        Collections.unmodifiableMap(map7);
        C0665d[] c0665dArr8 = {new C0665d(InterfaceC0144a.class, 8)};
        HashMap map8 = new HashMap();
        C0665d c0665d8 = c0665dArr8[0];
        Class cls15 = c0665d8.f4217a;
        if (map8.containsKey(cls15)) {
            throw new IllegalArgumentException(a1.m14329i(cls15, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
        }
        map8.put(cls15, c0665d8);
        Class cls16 = c0665dArr8[0].f4217a;
        Collections.unmodifiableMap(map8);
        int i10 = q2.CONFIG_NAME_FIELD_NUMBER;
        try {
            m1933a();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    /* renamed from: a */
    public static void m1933a() {
        AbstractC2291b.m5966a();
        AbstractC0159p.m369f(new C0667f(C2943k.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 0)}, 0), true);
        AbstractC0159p.m369f(new C0667f(C2955w.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 2)}, 1), true);
        AbstractC0159p.m369f(new C0667f(d0.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 3)}, 2), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            AbstractC0159p.m369f(new C0667f(j0.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 4)}, 3), true);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        AbstractC0159p.m369f(new C0667f(u0.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 5)}, 4), true);
        AbstractC0159p.m369f(new C0667f(g2.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 6)}, 5), true);
        AbstractC0159p.m369f(new C0667f(l2.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 7)}, 6), true);
        AbstractC0159p.m369f(new C0667f(t2.class, new C0665d[]{new C0665d(InterfaceC0144a.class, 8)}, 7), true);
        AbstractC0159p.m370g(new C0664c());
    }
}
