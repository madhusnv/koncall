package p001o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import p001o.gjb;

/* loaded from: classes5.dex */
public class ooe implements gjb {

    /* renamed from: a */
    public final gjb f38688a;

    /* renamed from: b */
    public final Resources f38689b;

    /* renamed from: o.ooe$a */
    public static final class C15857a implements hjb {

        /* renamed from: a */
        public final Resources f38690a;

        public C15857a(Resources resources) {
            this.f38690a = resources;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new ooe(this.f38690a, eobVar.m25384d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* renamed from: o.ooe$b */
    public static class C15858b implements hjb {

        /* renamed from: a */
        public final Resources f38691a;

        public C15858b(Resources resources) {
            this.f38691a = resources;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new ooe(this.f38691a, eobVar.m25384d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* renamed from: o.ooe$c */
    public static class C15859c implements hjb {

        /* renamed from: a */
        public final Resources f38692a;

        public C15859c(Resources resources) {
            this.f38692a = resources;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new ooe(this.f38692a, eobVar.m25384d(Uri.class, InputStream.class));
        }
    }

    /* renamed from: o.ooe$d */
    public static class C15860d implements hjb {

        /* renamed from: a */
        public final Resources f38693a;

        public C15860d(Resources resources) {
            this.f38693a = resources;
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new ooe(this.f38693a, b4i.m18148c());
        }
    }

    public ooe(Resources resources, gjb gjbVar) {
        this.f38689b = resources;
        this.f38688a = gjbVar;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Integer num, int i, int i2, rec recVar) {
        Uri uriM42509d = m42509d(num);
        if (uriM42509d == null) {
            return null;
        }
        return this.f38688a.mo18150b(uriM42509d, i, i2, recVar);
    }

    /* renamed from: d */
    public final Uri m42509d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f38689b.getResourcePackageName(num.intValue()) + '/' + this.f38689b.getResourceTypeName(num.intValue()) + '/' + this.f38689b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException unused) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Received invalid resource id: ");
            sb.append(num);
            return null;
        }
    }

    @Override // p001o.gjb
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Integer num) {
        return true;
    }
}
