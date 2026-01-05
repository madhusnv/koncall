package p001o;

import android.content.Context;
import android.net.Uri;
import com.facebook.C10773c;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class de8 {

    /* renamed from: f */
    public static final C12880c f19636f = new C12880c(null);

    /* renamed from: a */
    public final Context f19637a;

    /* renamed from: b */
    public final Uri f19638b;

    /* renamed from: c */
    public final InterfaceC12879b f19639c;

    /* renamed from: d */
    public final boolean f19640d;

    /* renamed from: e */
    public final Object f19641e;

    /* renamed from: o.de8$a */
    public static final class C12878a {

        /* renamed from: a */
        public final Context f19642a;

        /* renamed from: b */
        public final Uri f19643b;

        /* renamed from: c */
        public InterfaceC12879b f19644c;

        /* renamed from: d */
        public boolean f19645d;

        /* renamed from: e */
        public Object f19646e;

        public C12878a(Context context, Uri uri) {
            sq8.m48649h(context, "context");
            sq8.m48649h(uri, "imageUri");
            this.f19642a = context;
            this.f19643b = uri;
        }

        /* renamed from: a */
        public final de8 m22842a() {
            Context context = this.f19642a;
            Uri uri = this.f19643b;
            InterfaceC12879b interfaceC12879b = this.f19644c;
            boolean z = this.f19645d;
            Object obj = this.f19646e;
            if (obj == null) {
                obj = new Object();
            } else if (obj == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            return new de8(context, uri, interfaceC12879b, z, obj, null);
        }

        /* renamed from: b */
        public final C12878a m22843b(boolean z) {
            this.f19645d = z;
            return this;
        }

        /* renamed from: c */
        public final C12878a m22844c(InterfaceC12879b interfaceC12879b) {
            this.f19644c = interfaceC12879b;
            return this;
        }

        /* renamed from: d */
        public final C12878a m22845d(Object obj) {
            this.f19646e = obj;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12878a)) {
                return false;
            }
            C12878a c12878a = (C12878a) obj;
            return sq8.m48644c(this.f19642a, c12878a.f19642a) && sq8.m48644c(this.f19643b, c12878a.f19643b);
        }

        public int hashCode() {
            return (this.f19642a.hashCode() * 31) + this.f19643b.hashCode();
        }

        public String toString() {
            return "Builder(context=" + this.f19642a + ", imageUri=" + this.f19643b + ')';
        }
    }

    /* renamed from: o.de8$b */
    public interface InterfaceC12879b {
        /* renamed from: a */
        void mo22846a(ee8 ee8Var);
    }

    /* renamed from: o.de8$c */
    public static final class C12880c {
        public C12880c() {
        }

        public /* synthetic */ C12880c(id5 id5Var) {
            this();
        }

        /* renamed from: a */
        public final Uri m22847a(String str, int i, int i2, String str2) {
            rri.m47116k(str, "userId");
            int iMax = Math.max(i, 0);
            int iMax2 = Math.max(i2, 0);
            if (!((iMax == 0 && iMax2 == 0) ? false : true)) {
                throw new IllegalArgumentException("Either width or height must be greater than 0".toString());
            }
            Uri.Builder builderBuildUpon = Uri.parse(cgf.m21207h()).buildUpon();
            h8g h8gVar = h8g.f26398a;
            String str3 = String.format(Locale.US, "%s/%s/picture", Arrays.copyOf(new Object[]{C10773c.m13031x(), str}, 2));
            sq8.m48648g(str3, "format(locale, format, *args)");
            Uri.Builder builderPath = builderBuildUpon.path(str3);
            if (iMax2 != 0) {
                builderPath.appendQueryParameter("height", String.valueOf(iMax2));
            }
            if (iMax != 0) {
                builderPath.appendQueryParameter("width", String.valueOf(iMax));
            }
            builderPath.appendQueryParameter("migration_overrides", "{october_2012:true}");
            if (!cri.d0(str2)) {
                builderPath.appendQueryParameter("access_token", str2);
            } else if (!cri.d0(C10773c.m13026s()) && !cri.d0(C10773c.m13020m())) {
                builderPath.appendQueryParameter("access_token", C10773c.m13020m() + '|' + C10773c.m13026s());
            }
            Uri uriBuild = builderPath.build();
            sq8.m48648g(uriBuild, "builder.build()");
            return uriBuild;
        }
    }

    public /* synthetic */ de8(Context context, Uri uri, InterfaceC12879b interfaceC12879b, boolean z, Object obj, id5 id5Var) {
        this(context, uri, interfaceC12879b, z, obj);
    }

    /* renamed from: a */
    public final InterfaceC12879b m22838a() {
        return this.f19639c;
    }

    /* renamed from: b */
    public final Object m22839b() {
        return this.f19641e;
    }

    /* renamed from: c */
    public final Uri m22840c() {
        return this.f19638b;
    }

    /* renamed from: d */
    public final boolean m22841d() {
        return this.f19640d;
    }

    public de8(Context context, Uri uri, InterfaceC12879b interfaceC12879b, boolean z, Object obj) {
        this.f19637a = context;
        this.f19638b = uri;
        this.f19639c = interfaceC12879b;
        this.f19640d = z;
        this.f19641e = obj;
    }
}
