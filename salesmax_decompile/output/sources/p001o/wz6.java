package p001o;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.http.cookie.ClientCookie;
import p001o.rz1;

/* loaded from: classes.dex */
public final class wz6 {

    /* renamed from: a */
    public static final wz6 f52913a = new wz6();

    /* renamed from: o.wz6$a */
    public static final class C18006a extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ long f52914a;

        /* renamed from: b */
        public final /* synthetic */ long f52915b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18006a(long j, long j2) {
            super(1);
            this.f52914a = j;
            this.f52915b = j2;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            sq8.m48649h(file, "it");
            long jLastModified = file.lastModified();
            boolean z = false;
            if (this.f52914a <= jLastModified && jLastModified <= this.f52915b) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.wz6$b */
    public static final class C18007b extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18007b f52916a = new C18007b();

        public C18007b() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            sq8.m48649h(file, "it");
            return Boolean.valueOf(file.isFile() && !wz6.f52913a.m55452f(file));
        }
    }

    /* renamed from: o.wz6$c */
    public static final class C18008c extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ Context f52917a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18008c(Context context) {
            super(1);
            this.f52917a = context;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rz1 invoke(File file) {
            sq8.m48649h(file, "it");
            rz1.C16681a c16681a = new rz1.C16681a();
            String absolutePath = file.getAbsolutePath();
            sq8.m48648g(absolutePath, "getAbsolutePath(...)");
            rz1.C16681a c16681aM47313b = c16681a.m47318g(absolutePath).m47321j(Uri.fromFile(file)).m47313b(this.f52917a);
            String name = file.getName();
            sq8.m48648g(name, "getName(...)");
            rz1.C16681a c16681aM47316e = c16681aM47313b.m47316e(name);
            String absolutePath2 = file.getAbsolutePath();
            sq8.m48648g(absolutePath2, "getAbsolutePath(...)");
            rz1.C16681a c16681aM47315d = c16681aM47316e.m47317f(absolutePath2).m47314c(Long.valueOf(file.lastModified())).m47315d(Long.valueOf(file.lastModified()));
            uz6 uz6Var = uz6.f49700a;
            Context context = this.f52917a;
            String absolutePath3 = file.getAbsolutePath();
            sq8.m48648g(absolutePath3, "getAbsolutePath(...)");
            return c16681aM47315d.m47319h(uz6Var.m52180d(context, absolutePath3)).m47312a();
        }
    }

    /* renamed from: o.wz6$d */
    public static final class C18009d extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ long f52918a;

        /* renamed from: b */
        public final /* synthetic */ long f52919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18009d(long j, long j2) {
            super(1);
            this.f52918a = j;
            this.f52919b = j2;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            sq8.m48649h(file, "it");
            long jLastModified = file.lastModified();
            boolean z = false;
            if (this.f52918a <= jLastModified && jLastModified <= this.f52919b) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: o.wz6$e */
    public static final class C18010e extends kf9 implements xk7 {

        /* renamed from: a */
        public static final C18010e f52920a = new C18010e();

        public C18010e() {
            super(1);
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            sq8.m48649h(file, "it");
            return Boolean.valueOf(file.isFile() && !wz6.f52913a.m55452f(file));
        }
    }

    /* renamed from: o.wz6$f */
    public static final class C18011f extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ String f52921a;

        /* renamed from: b */
        public final /* synthetic */ Context f52922b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18011f(String str, Context context) {
            super(1);
            this.f52921a = str;
            this.f52922b = context;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final rz1 invoke(File file) {
            sq8.m48649h(file, "it");
            rz1.C16681a c16681a = new rz1.C16681a();
            String absolutePath = file.getAbsolutePath();
            sq8.m48648g(absolutePath, "getAbsolutePath(...)");
            rz1.C16681a c16681aM47318g = c16681a.m47318g(absolutePath);
            String str = this.f52921a;
            rz1.C16681a c16681aM47313b = c16681aM47318g.m47321j(str != null ? Uri.parse(str) : Uri.fromFile(file)).m47313b(this.f52922b);
            String name = file.getName();
            sq8.m48648g(name, "getName(...)");
            rz1.C16681a c16681aM47316e = c16681aM47313b.m47316e(name);
            String absolutePath2 = file.getAbsolutePath();
            sq8.m48648g(absolutePath2, "getAbsolutePath(...)");
            rz1.C16681a c16681aM47315d = c16681aM47316e.m47317f(absolutePath2).m47314c(Long.valueOf(file.lastModified())).m47315d(Long.valueOf(file.lastModified()));
            uz6 uz6Var = uz6.f49700a;
            Context context = this.f52922b;
            String absolutePath3 = file.getAbsolutePath();
            sq8.m48648g(absolutePath3, "getAbsolutePath(...)");
            return c16681aM47315d.m47319h(uz6Var.m52180d(context, absolutePath3)).m47312a();
        }
    }

    /* renamed from: o.wz6$g */
    public static final class C18012g extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ long f52923a;

        /* renamed from: b */
        public final /* synthetic */ wz6 f52924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18012g(long j, wz6 wz6Var) {
            super(1);
            this.f52923a = j;
            this.f52924b = wz6Var;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            sq8.m48649h(file, "it");
            return Boolean.valueOf(file.lastModified() >= this.f52923a && !this.f52924b.m55452f(file) && file.isFile());
        }
    }

    /* renamed from: o.wz6$h */
    public static final class C18013h extends kf9 implements xk7 {

        /* renamed from: a */
        public final /* synthetic */ long f52925a;

        /* renamed from: b */
        public final /* synthetic */ wz6 f52926b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18013h(long j, wz6 wz6Var) {
            super(1);
            this.f52925a = j;
            this.f52926b = wz6Var;
        }

        @Override // p001o.xk7
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            sq8.m48649h(file, "it");
            return Boolean.valueOf(file.lastModified() >= this.f52925a && !this.f52926b.m55452f(file) && file.isFile());
        }
    }

    /* renamed from: e */
    public static /* synthetic */ rz1 m55448e(wz6 wz6Var, Context context, String str, long j, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return wz6Var.m55451d(context, str, j, str2);
    }

    /* renamed from: b */
    public final Set m55449b(Context context, String str, long j, long j2) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        File file = new File(str);
        return file.isDirectory() ? qef.m45304C(qef.m45319v(qef.m45310m(qef.m45310m(zz6.m60148k(file), new C18006a(j, j2)), C18007b.f52916a), new C18008c(context))) : nif.m40664e();
    }

    /* renamed from: c */
    public final Set m55450c(Context context, String str, long j, long j2, String str2) {
        sq8.m48649h(context, "context");
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        File file = new File(str);
        return file.isDirectory() ? qef.m45304C(qef.m45319v(qef.m45310m(qef.m45310m(zz6.m60148k(file), new C18009d(j, j2)), C18010e.f52920a), new C18011f(str2, context))) : nif.m40664e();
    }

    /* renamed from: d */
    public final rz1 m55451d(Context context, String str, long j, String str2) {
        Object next;
        zv5 zv5VarM59973b;
        Object next2;
        Object next3;
        sq8.m48649h(context, "context");
        sq8.m48649h(str, ClientCookie.PATH_ATTR);
        if (str2 == null || (zv5VarM59973b = zv5.m59973b(context, Uri.parse(str2))) == null) {
            File file = new File(str);
            if (!file.isDirectory()) {
                return null;
            }
            Iterator it = qef.m45310m(zz6.m60148k(file), new C18013h(j, this)).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    long jLastModified = ((File) next).lastModified() - j;
                    do {
                        Object next4 = it.next();
                        long jLastModified2 = ((File) next4).lastModified() - j;
                        if (jLastModified > jLastModified2) {
                            next = next4;
                            jLastModified = jLastModified2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            File file2 = (File) next;
            if (file2 == null) {
                return null;
            }
            rz1.C16681a c16681a = new rz1.C16681a();
            String absolutePath = file2.getAbsolutePath();
            sq8.m48648g(absolutePath, "getAbsolutePath(...)");
            rz1.C16681a c16681aM47313b = c16681a.m47318g(absolutePath).m47321j(Uri.fromFile(file2)).m47313b(context);
            String name = file2.getName();
            sq8.m48648g(name, "getName(...)");
            rz1.C16681a c16681aM47316e = c16681aM47313b.m47316e(name);
            String absolutePath2 = file2.getAbsolutePath();
            sq8.m48648g(absolutePath2, "getAbsolutePath(...)");
            rz1.C16681a c16681aM47315d = c16681aM47316e.m47317f(absolutePath2).m47314c(Long.valueOf(file2.lastModified())).m47315d(Long.valueOf(file2.lastModified()));
            uz6 uz6Var = uz6.f49700a;
            String absolutePath3 = file2.getAbsolutePath();
            sq8.m48648g(absolutePath3, "getAbsolutePath(...)");
            return c16681aM47315d.m47319h(uz6Var.m52180d(context, absolutePath3)).m47312a();
        }
        List listM55453g = f52913a.m55453g(zv5VarM59973b);
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listM55453g.iterator();
        while (true) {
            boolean z = false;
            if (!it2.hasNext()) {
                break;
            }
            Object next5 = it2.next();
            zv5 zv5Var = (zv5) next5;
            if (zv5Var.mo32896g() >= j && zv5Var.mo32895f()) {
                z = true;
            }
            if (z) {
                arrayList.add(next5);
            }
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                long jMo32896g = ((zv5) next2).mo32896g() - j;
                do {
                    Object next6 = it3.next();
                    long jMo32896g2 = ((zv5) next6).mo32896g() - j;
                    if (jMo32896g > jMo32896g2) {
                        next2 = next6;
                        jMo32896g = jMo32896g2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next2 = null;
        }
        zv5 zv5Var2 = (zv5) next2;
        if (zv5Var2 != null) {
            rz1.C16681a c16681a2 = new rz1.C16681a();
            String string = zv5Var2.mo32893d().toString();
            sq8.m48648g(string, "toString(...)");
            rz1.C16681a c16681aM47313b2 = c16681a2.m47318g(string).m47321j(zv5Var2.mo32893d()).m47313b(context);
            String strMo32892c = zv5Var2.mo32892c();
            if (strMo32892c == null) {
                strMo32892c = "";
            }
            sq8.m48646e(strMo32892c);
            rz1.C16681a c16681aM47316e2 = c16681aM47313b2.m47316e(strMo32892c);
            String string2 = zv5Var2.mo32893d().toString();
            sq8.m48648g(string2, "toString(...)");
            rz1.C16681a c16681aM47315d2 = c16681aM47316e2.m47317f(string2).m47314c(Long.valueOf(zv5Var2.mo32896g())).m47315d(Long.valueOf(zv5Var2.mo32896g()));
            uz6 uz6Var2 = uz6.f49700a;
            Uri uriMo32893d = zv5Var2.mo32893d();
            sq8.m48648g(uriMo32893d, "getUri(...)");
            rz1 rz1VarM47312a = c16681aM47315d2.m47319h(uz6Var2.m52179c(context, uriMo32893d)).m47312a();
            if (rz1VarM47312a != null) {
                return rz1VarM47312a;
            }
        }
        wz6 wz6Var = f52913a;
        File file3 = new File(str);
        if (file3.isDirectory()) {
            Iterator it4 = qef.m45310m(zz6.m60148k(file3), new C18012g(j, wz6Var)).iterator();
            if (it4.hasNext()) {
                next3 = it4.next();
                if (it4.hasNext()) {
                    long jLastModified3 = ((File) next3).lastModified() - j;
                    do {
                        Object next7 = it4.next();
                        long jLastModified4 = ((File) next7).lastModified() - j;
                        if (jLastModified3 > jLastModified4) {
                            next3 = next7;
                            jLastModified3 = jLastModified4;
                        }
                    } while (it4.hasNext());
                }
            } else {
                next3 = null;
            }
            File file4 = (File) next3;
            if (file4 != null) {
                String absolutePath4 = file4.getAbsolutePath();
                sq8.m48648g(absolutePath4, "getAbsolutePath(...)");
                String strM24591E = e9g.m24591E(absolutePath4, str, str2, false);
                rz1.C16681a c16681a3 = new rz1.C16681a();
                String absolutePath5 = file4.getAbsolutePath();
                sq8.m48648g(absolutePath5, "getAbsolutePath(...)");
                rz1.C16681a c16681aM47313b3 = c16681a3.m47318g(absolutePath5).m47321j(Uri.parse(strM24591E)).m47313b(context);
                String name2 = file4.getName();
                sq8.m48648g(name2, "getName(...)");
                rz1.C16681a c16681aM47316e3 = c16681aM47313b3.m47316e(name2);
                String absolutePath6 = file4.getAbsolutePath();
                sq8.m48648g(absolutePath6, "getAbsolutePath(...)");
                rz1.C16681a c16681aM47315d3 = c16681aM47316e3.m47317f(absolutePath6).m47314c(Long.valueOf(file4.lastModified())).m47315d(Long.valueOf(file4.lastModified()));
                uz6 uz6Var3 = uz6.f49700a;
                String absolutePath7 = file4.getAbsolutePath();
                sq8.m48648g(absolutePath7, "getAbsolutePath(...)");
                return c16681aM47315d3.m47319h(uz6Var3.m52180d(context, absolutePath7)).m47312a();
            }
        }
        return null;
    }

    /* renamed from: f */
    public final boolean m55452f(File file) {
        while (file != null) {
            if (file.isHidden()) {
                return true;
            }
            file = file.getParentFile();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m55453g(zv5 zv5Var) {
        zv5[] zv5VarArrMo32897h;
        ArrayList arrayList = new ArrayList();
        if (zv5Var != null && (zv5VarArrMo32897h = zv5Var.mo32897h()) != null) {
            for (zv5 zv5Var2 : zv5VarArrMo32897h) {
                if (zv5Var2.mo32894e()) {
                    String strMo32892c = zv5Var2.mo32892c();
                    if (strMo32892c != null) {
                        sq8.m48646e(strMo32892c);
                        boolean z = e9g.m24597K(strMo32892c, ".", false, 2, null);
                        if (!z) {
                            arrayList.addAll(f52913a.m55453g(zv5Var2));
                        }
                    }
                } else if (zv5Var2.mo32895f()) {
                    String strMo32892c2 = zv5Var2.mo32892c();
                    if (strMo32892c2 != null) {
                        sq8.m48646e(strMo32892c2);
                        boolean z2 = e9g.m24597K(strMo32892c2, ".", false, 2, null);
                        if (!z2) {
                            sq8.m48646e(zv5Var2);
                            arrayList.add(zv5Var2);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
