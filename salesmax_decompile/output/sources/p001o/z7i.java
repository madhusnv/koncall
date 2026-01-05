package p001o;

import android.content.ContentResolver;
import android.net.Uri;
import com.amplifyframework.storage.s3.transfer.TransferTable;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p001o.gjb;

/* loaded from: classes5.dex */
public class z7i implements gjb {

    /* renamed from: b */
    public static final Set f56649b = Collections.unmodifiableSet(new HashSet(Arrays.asList(TransferTable.COLUMN_FILE, "android.resource", FirebaseAnalytics.Param.CONTENT)));

    /* renamed from: a */
    public final InterfaceC18570c f56650a;

    /* renamed from: o.z7i$a */
    public static final class C18568a implements hjb, InterfaceC18570c {

        /* renamed from: a */
        public final ContentResolver f56651a;

        public C18568a(ContentResolver contentResolver) {
            this.f56651a = contentResolver;
        }

        @Override // p001o.z7i.InterfaceC18570c
        /* renamed from: a */
        public lu4 mo58878a(Uri uri) {
            return new qp0(this.f56651a, uri);
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new z7i(this);
        }
    }

    /* renamed from: o.z7i$b */
    public static class C18569b implements hjb, InterfaceC18570c {

        /* renamed from: a */
        public final ContentResolver f56652a;

        public C18569b(ContentResolver contentResolver) {
            this.f56652a = contentResolver;
        }

        @Override // p001o.z7i.InterfaceC18570c
        /* renamed from: a */
        public lu4 mo58878a(Uri uri) {
            return new yv6(this.f56652a, uri);
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new z7i(this);
        }
    }

    /* renamed from: o.z7i$c */
    public interface InterfaceC18570c {
        /* renamed from: a */
        lu4 mo58878a(Uri uri);
    }

    /* renamed from: o.z7i$d */
    public static class C18571d implements hjb, InterfaceC18570c {

        /* renamed from: a */
        public final ContentResolver f56653a;

        public C18571d(ContentResolver contentResolver) {
            this.f56653a = contentResolver;
        }

        @Override // p001o.z7i.InterfaceC18570c
        /* renamed from: a */
        public lu4 mo58878a(Uri uri) {
            return new x6g(this.f56653a, uri);
        }

        @Override // p001o.hjb
        /* renamed from: b */
        public gjb mo18152b(eob eobVar) {
            return new z7i(this);
        }
    }

    public z7i(InterfaceC18570c interfaceC18570c) {
        this.f56650a = interfaceC18570c;
    }

    @Override // p001o.gjb
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public gjb.C13758a mo18150b(Uri uri, int i, int i2, rec recVar) {
        return new gjb.C13758a(new l6c(uri), this.f56650a.mo58878a(uri));
    }

    @Override // p001o.gjb
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo18149a(Uri uri) {
        return f56649b.contains(uri.getScheme());
    }
}
