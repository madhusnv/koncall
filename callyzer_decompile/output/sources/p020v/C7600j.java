package p020v;

import a0.C0001a;
import android.content.Context;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import c0.C0825r;
import c0.C0832y;
import c0.d1;
import c9.C0908c;
import i0.C3075f;
import i0.e0;
import i0.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import og.u1;
import p021w.C7851q;
import pg.b6;
import pg.c6;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: v.j */
/* loaded from: classes.dex */
public final class C7600j {

    /* renamed from: a */
    public final Context f36595a;

    /* renamed from: b */
    public final C0001a f36596b;

    /* renamed from: c */
    public final C3075f f36597c;

    /* renamed from: d */
    public final o0 f36598d;

    /* renamed from: e */
    public final C7851q f36599e;

    /* renamed from: f */
    public final q0 f36600f;

    /* renamed from: g */
    public final long f36601g;

    /* renamed from: i */
    public final C0832y f36603i;

    /* renamed from: j */
    public final d1 f36604j;

    /* renamed from: k */
    public final C0825r f36605k;

    /* renamed from: h */
    public final HashMap f36602h = new HashMap();

    /* renamed from: l */
    public final Object f36606l = new Object();

    /* renamed from: m */
    public ArrayList f36607m = new ArrayList();

    public C7600j(Context context, C3075f c3075f, C0825r c0825r, long j6, C0832y c0832y, C0908c c0908c) throws InitializationException {
        this.f36595a = context;
        this.f36597c = c3075f;
        C7851q c7851qM14834a = C7851q.m14834a(context, c3075f.f16453b);
        this.f36599e = c7851qM14834a;
        this.f36600f = q0.m14422b(context);
        C0001a c0001a = new C0001a(c7851qM14834a);
        this.f36596b = c0001a;
        o0 o0Var = new o0(c0001a);
        this.f36598d = o0Var;
        synchronized (c0001a.f0a) {
            c0001a.f2c.add(o0Var);
        }
        this.f36601g = j6;
        this.f36603i = c0832y;
        this.f36605k = c0825r;
        try {
            List listAsList = Arrays.asList(c7851qM14834a.m14836c());
            this.f36604j = new d1(listAsList, c7851qM14834a, c3075f.f16452a);
            m14403d(listAsList);
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        }
    }

    /* renamed from: a */
    public final LinkedHashSet m14400a() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f36606l) {
            linkedHashSet = new LinkedHashSet(this.f36607m);
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    public final C7612v m14401b(String str) throws CameraUnavailableException {
        synchronized (this.f36606l) {
            if (!this.f36607m.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        Context context = this.f36595a;
        C7851q c7851q = this.f36599e;
        C7613w c7613wM14402c = m14402c(str);
        C0001a c0001a = this.f36596b;
        o0 o0Var = this.f36598d;
        C3075f c3075f = this.f36597c;
        return new C7612v(context, c7851q, str, c7613wM14402c, c0001a, o0Var, c3075f.f16452a, c3075f.f16453b, this.f36600f, this.f36601g, this.f36603i);
    }

    /* renamed from: c */
    public final C7613w m14402c(String str) throws CameraUnavailableException {
        HashMap map = this.f36602h;
        try {
            C7613w c7613w = (C7613w) map.get(str);
            if (c7613w != null) {
                return c7613w;
            }
            C7613w c7613w2 = new C7613w(str, this.f36599e);
            map.put(str, c7613w2);
            return c7613w2;
        } catch (CameraAccessExceptionCompat e2) {
            throw new CameraUnavailableException(e2);
        }
    }

    /* renamed from: d */
    public final void m14403d(List list) {
        String strM11563a;
        ArrayList arrayList = new ArrayList(list);
        C0825r c0825r = this.f36605k;
        try {
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            if (c0825r == null) {
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    arrayList2.add((String) obj);
                }
            } else {
                try {
                    strM11563a = c6.m11563a(this.f36599e, c0825r.m2226b(), arrayList);
                } catch (IllegalStateException unused) {
                    strM11563a = null;
                }
                ArrayList arrayList3 = new ArrayList();
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    String str = (String) obj2;
                    if (!str.equals(strM11563a)) {
                        arrayList3.add(m14402c(str));
                    }
                }
                ArrayList arrayListM2225a = c0825r.m2225a(arrayList3);
                int size3 = arrayListM2225a.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayListM2225a.get(i13);
                    i13++;
                    arrayList2.add(((e0) obj3).mo7323e());
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int size4 = arrayList2.size();
            while (i10 < size4) {
                Object obj4 = arrayList2.get(i10);
                i10++;
                String str2 = (String) obj4;
                if (str2.equals("0") || str2.equals("1")) {
                    arrayList4.add(str2);
                } else if (b6.m11545b(str2, this.f36599e)) {
                    arrayList4.add(str2);
                } else {
                    u1.m10942a("Camera2CameraFactory");
                }
            }
            synchronized (this.f36606l) {
                try {
                    if (this.f36607m.equals(arrayList4)) {
                        return;
                    }
                    Objects.toString(this.f36607m);
                    arrayList4.toString();
                    u1.m10942a("Camera2CameraFactory");
                    this.f36607m = arrayList4;
                } finally {
                }
            }
        } catch (CameraAccessExceptionCompat e2) {
            throw new InitializationException(new CameraUnavailableException(e2));
        } catch (CameraUnavailableException e10) {
            throw new InitializationException(e10);
        }
    }
}
