package nk;

import com.google.gson.JsonIOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kk.AbstractC4103w;
import org.bouncycastle.jcajce.provider.digest.AbstractC5601a;
import pk.AbstractC5973c;
import rk.C6566c;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: nk.z */
/* loaded from: classes.dex */
public final class C5103z {

    /* renamed from: a */
    public final String f24994a;

    /* renamed from: b */
    public final Field f24995b;

    /* renamed from: c */
    public final String f24996c;

    /* renamed from: d */
    public final /* synthetic */ boolean f24997d;

    /* renamed from: e */
    public final /* synthetic */ Method f24998e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC4103w f24999f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC4103w f25000g;

    /* renamed from: h */
    public final /* synthetic */ boolean f25001h;

    /* renamed from: i */
    public final /* synthetic */ boolean f25002i;

    public C5103z(String str, Field field, boolean z6, Method method, AbstractC4103w abstractC4103w, AbstractC4103w abstractC4103w2, boolean z10, boolean z11) {
        this.f24997d = z6;
        this.f24998e = method;
        this.f24999f = abstractC4103w;
        this.f25000g = abstractC4103w2;
        this.f25001h = z10;
        this.f25002i = z11;
        this.f24994a = str;
        this.f24995b = field;
        this.f24996c = field.getName();
    }

    /* renamed from: a */
    public final void m10036a(C6566c c6566c, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        boolean z6 = this.f24997d;
        Field field = this.f24995b;
        Method method = this.f24998e;
        if (z6) {
            if (method == null) {
                e0.m10012b(obj, field);
            } else {
                e0.m10012b(obj, method);
            }
        }
        if (method != null) {
            try {
                objInvoke = method.invoke(obj, null);
            } catch (InvocationTargetException e2) {
                throw new JsonIOException(AbstractC5601a.m11238i("Accessor ", AbstractC5973c.m12007d(method, false), " threw exception"), e2.getCause());
            }
        } else {
            objInvoke = field.get(obj);
        }
        if (objInvoke == obj) {
            return;
        }
        c6566c.mo10028A(this.f24994a);
        this.f24999f.mo8852c(c6566c, objInvoke);
    }
}
