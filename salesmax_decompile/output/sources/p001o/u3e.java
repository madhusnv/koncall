package p001o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import p001o.gjb;
import p001o.lu4;

/* loaded from: classes5.dex */
public final class u3e implements gjb {

    /* renamed from: a */
    public final Context f48276a;

    /* renamed from: b */
    public final gjb f48277b;

    /* renamed from: c */
    public final gjb f48278c;

    /* renamed from: d */
    public final Class f48279d;

    /* renamed from: o.u3e$a */
    public static abstract class AbstractC17290a implements hjb {

        /* renamed from: a */
        public final Context f48280a;

        /* renamed from: b */
        public final Class f48281b;

        public AbstractC17290a(Context context, Class cls) {
            this.f48280a = context;
            this.f48281b = cls;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public final gjb mo18152b(eob eobVar) {
            return new u3e(this.f48280a, eobVar.m25384d(File.class, this.f48281b), eobVar.m25384d(Uri.class, this.f48281b), this.f48281b);
        }
    }

    /* renamed from: o.u3e$b */
    public static final class C17291b extends AbstractC17290a {
        public C17291b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: o.u3e$c */
    public static final class C17292c extends AbstractC17290a {
        public C17292c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: o.u3e$d */
    public static final class C17293d implements lu4 {

        /* renamed from: x */
        public static final String[] f48282x = {"_data"};

        /* renamed from: a */
        public final Context f48283a;

        /* renamed from: b */
        public final gjb f48284b;

        /* renamed from: c */
        public final gjb f48285c;

        /* renamed from: d */
        public final Uri f48286d;

        /* renamed from: e */
        public final int f48287e;

        /* renamed from: f */
        public final int f48288f;

        /* renamed from: g */
        public final rec f48289g;

        /* renamed from: h */
        public final Class f48290h;

        /* renamed from: q */
        public volatile boolean f48291q;

        /* renamed from: s */
        public volatile lu4 f48292s;

        public C17293d(Context context, gjb gjbVar, gjb gjbVar2, Uri uri, int i, int i2, rec recVar, Class cls) {
            this.f48283a = context.getApplicationContext();
            this.f48284b = gjbVar;
            this.f48285c = gjbVar2;
            this.f48286d = uri;
            this.f48287e = i;
            this.f48288f = i2;
            this.f48289g = recVar;
            this.f48290h = cls;
        }

        @Override // p001o.lu4
        /* renamed from: a */
        public Class mo18153a() {
            return this.f48290h;
        }

        @Override // p001o.lu4
        /* renamed from: b */
        public void mo18154b() {
            lu4 lu4Var = this.f48292s;
            if (lu4Var != null) {
                lu4Var.mo18154b();
            }
        }

        /* renamed from: c */
        public final gjb.C13758a m50895c() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f48284b.mo18150b(m50898h(this.f48286d), this.f48287e, this.f48288f, this.f48289g);
            }
            return this.f48285c.mo18150b(m50897g() ? MediaStore.setRequireOriginal(this.f48286d) : this.f48286d, this.f48287e, this.f48288f, this.f48289g);
        }

        @Override // p001o.lu4
        public void cancel() {
            this.f48291q = true;
            lu4 lu4Var = this.f48292s;
            if (lu4Var != null) {
                lu4Var.cancel();
            }
        }

        @Override // p001o.lu4
        /* renamed from: d */
        public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) {
            try {
                lu4 lu4VarM50896f = m50896f();
                if (lu4VarM50896f == null) {
                    interfaceC15153a.mo17835c(new IllegalArgumentException("Failed to build fetcher for: " + this.f48286d));
                    return;
                }
                this.f48292s = lu4VarM50896f;
                if (this.f48291q) {
                    cancel();
                } else {
                    lu4VarM50896f.mo18155d(gidVar, interfaceC15153a);
                }
            } catch (FileNotFoundException e) {
                interfaceC15153a.mo17835c(e);
            }
        }

        @Override // p001o.lu4
        /* renamed from: e */
        public ez4 mo18156e() {
            return ez4.LOCAL;
        }

        /* renamed from: f */
        public final lu4 m50896f() {
            gjb.C13758a c13758aM50895c = m50895c();
            if (c13758aM50895c != null) {
                return c13758aM50895c.f25339c;
            }
            return null;
        }

        /* renamed from: g */
        public final boolean m50897g() {
            return this.f48283a.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        /* renamed from: h */
        public final File m50898h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f48283a.getContentResolver().query(uri, f48282x, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }
    }

    public u3e(Context context, gjb gjbVar, gjb gjbVar2, Class cls) {
        this.f48276a = context.getApplicationContext();
        this.f48277b = gjbVar;
        this.f48278c = gjbVar2;
        this.f48279d = cls;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Uri uri, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(uri), new C17293d(this.f48276a, this.f48277b, this.f48278c, uri, i, i2, recVar, this.f48279d));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && w9b.m54118b(uri);
    }
}
