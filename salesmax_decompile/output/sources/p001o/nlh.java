package p001o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.ComponentCallbacks2C10724a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p001o.lu4;

/* loaded from: classes5.dex */
public class nlh implements lu4 {

    /* renamed from: a */
    public final Uri f37018a;

    /* renamed from: b */
    public final qlh f37019b;

    /* renamed from: c */
    public InputStream f37020c;

    /* renamed from: o.nlh$a */
    public static class C15610a implements olh {

        /* renamed from: b */
        public static final String[] f37021b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f37022a;

        public C15610a(ContentResolver contentResolver) {
            this.f37022a = contentResolver;
        }

        @Override // p001o.olh
        /* renamed from: a */
        public Cursor mo40770a(Uri uri) {
            return this.f37022a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f37021b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* renamed from: o.nlh$b */
    public static class C15611b implements olh {

        /* renamed from: b */
        public static final String[] f37023b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f37024a;

        public C15611b(ContentResolver contentResolver) {
            this.f37024a = contentResolver;
        }

        @Override // p001o.olh
        /* renamed from: a */
        public Cursor mo40770a(Uri uri) {
            return this.f37024a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f37023b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    public nlh(Uri uri, qlh qlhVar) {
        this.f37018a = uri;
        this.f37019b = qlhVar;
    }

    /* renamed from: c */
    public static nlh m40766c(Context context, Uri uri, olh olhVar) {
        return new nlh(uri, new qlh(ComponentCallbacks2C10724a.m12647c(context).m12660j().m23124g(), olhVar, ComponentCallbacks2C10724a.m12647c(context).m12655e(), context.getContentResolver()));
    }

    /* renamed from: f */
    public static nlh m40767f(Context context, Uri uri) {
        return m40766c(context, uri, new C15610a(context.getContentResolver()));
    }

    /* renamed from: g */
    public static nlh m40768g(Context context, Uri uri) {
        return m40766c(context, uri, new C15611b(context.getContentResolver()));
    }

    @Override // p001o.lu4
    /* renamed from: a */
    public Class mo18153a() {
        return InputStream.class;
    }

    @Override // p001o.lu4
    /* renamed from: b */
    public void mo18154b() throws IOException {
        InputStream inputStream = this.f37020c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // p001o.lu4
    public void cancel() {
    }

    @Override // p001o.lu4
    /* renamed from: d */
    public void mo18155d(gid gidVar, lu4.InterfaceC15153a interfaceC15153a) throws Throwable {
        try {
            InputStream inputStreamM40769h = m40769h();
            this.f37020c = inputStreamM40769h;
            interfaceC15153a.mo17836f(inputStreamM40769h);
        } catch (FileNotFoundException e) {
            interfaceC15153a.mo17835c(e);
        }
    }

    @Override // p001o.lu4
    /* renamed from: e */
    public ez4 mo18156e() {
        return ez4.LOCAL;
    }

    /* renamed from: h */
    public final InputStream m40769h() throws Throwable {
        InputStream inputStreamM45639d = this.f37019b.m45639d(this.f37018a);
        int iM45636a = inputStreamM45639d != null ? this.f37019b.m45636a(this.f37018a) : -1;
        return iM45636a != -1 ? new lm6(inputStreamM45639d, iM45636a) : inputStreamM45639d;
    }
}
