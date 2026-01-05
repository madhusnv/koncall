package p001o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.Api;
import com.google.firebase.perf.util.Constants;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import p001o.bc7;
import p001o.xb7;

/* loaded from: classes2.dex */
public abstract class lzh {

    /* renamed from: a */
    public ConcurrentHashMap f34569a = new ConcurrentHashMap();

    /* renamed from: o.lzh$a */
    public class C15186a implements InterfaceC15187b {
        public C15186a() {
        }

        @Override // p001o.lzh.InterfaceC15187b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int mo38130b(bc7.C12352b c12352b) {
            return c12352b.m18593e();
        }

        @Override // p001o.lzh.InterfaceC15187b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo38129a(bc7.C12352b c12352b) {
            return c12352b.m18594f();
        }
    }

    /* renamed from: o.lzh$b */
    public interface InterfaceC15187b {
        /* renamed from: a */
        boolean mo38129a(Object obj);

        /* renamed from: b */
        int mo38130b(Object obj);
    }

    /* renamed from: e */
    public static Object m38126e(Object[] objArr, int i, InterfaceC15187b interfaceC15187b) {
        return m38127f(objArr, (i & 1) == 0 ? 400 : Constants.FROZEN_FRAME_TIME, (i & 2) != 0, interfaceC15187b);
    }

    /* renamed from: f */
    public static Object m38127f(Object[] objArr, int i, boolean z, InterfaceC15187b interfaceC15187b) {
        Object obj = null;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(interfaceC15187b.mo38130b(obj2) - i) * 2) + (interfaceC15187b.mo38129a(obj2) == z ? 0 : 1);
            if (obj == null || i2 > iAbs) {
                obj = obj2;
                i2 = iAbs;
            }
        }
        return obj;
    }

    /* renamed from: a */
    public abstract Typeface mo29710a(Context context, xb7.C18100c c18100c, Resources resources, int i);

    /* renamed from: b */
    public abstract Typeface mo29711b(Context context, CancellationSignal cancellationSignal, bc7.C12352b[] c12352bArr, int i);

    /* renamed from: c */
    public Typeface m38128c(Context context, InputStream inputStream) {
        File fileM39926e = mzh.m39926e(context);
        if (fileM39926e == null) {
            return null;
        }
        try {
            if (mzh.m39925d(fileM39926e, inputStream)) {
                return Typeface.createFromFile(fileM39926e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM39926e.delete();
        }
    }

    /* renamed from: d */
    public Typeface mo32958d(Context context, Resources resources, int i, String str, int i2) {
        File fileM39926e = mzh.m39926e(context);
        if (fileM39926e == null) {
            return null;
        }
        try {
            if (mzh.m39924c(fileM39926e, resources, i)) {
                return Typeface.createFromFile(fileM39926e.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileM39926e.delete();
        }
    }

    /* renamed from: g */
    public bc7.C12352b mo36378g(bc7.C12352b[] c12352bArr, int i) {
        return (bc7.C12352b) m38126e(c12352bArr, i, new C15186a());
    }
}
