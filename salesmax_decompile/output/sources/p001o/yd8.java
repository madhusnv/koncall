package p001o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.AbstractC10730a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C10734c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public interface yd8 {

    /* renamed from: o.yd8$a */
    public static final class C18382a implements yd8 {

        /* renamed from: a */
        public final ByteBuffer f55297a;

        /* renamed from: b */
        public final List f55298b;

        /* renamed from: c */
        public final wo0 f55299c;

        public C18382a(ByteBuffer byteBuffer, List list, wo0 wo0Var) {
            this.f55297a = byteBuffer;
            this.f55298b = list;
            this.f55299c = wo0Var;
        }

        @Override // p001o.yd8
        /* renamed from: a */
        public Bitmap mo57624a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m57628e(), null, options);
        }

        @Override // p001o.yd8
        /* renamed from: b */
        public void mo57625b() {
        }

        @Override // p001o.yd8
        /* renamed from: c */
        public int mo57626c() {
            return AbstractC10730a.m12691c(this.f55298b, fq1.m27330d(this.f55297a), this.f55299c);
        }

        @Override // p001o.yd8
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo57627d() {
            return AbstractC10730a.m12695g(this.f55298b, fq1.m27330d(this.f55297a));
        }

        /* renamed from: e */
        public final InputStream m57628e() {
            return fq1.m27333g(fq1.m27330d(this.f55297a));
        }
    }

    /* renamed from: o.yd8$b */
    public static final class C18383b implements yd8 {

        /* renamed from: a */
        public final C10734c f55300a;

        /* renamed from: b */
        public final wo0 f55301b;

        /* renamed from: c */
        public final List f55302c;

        public C18383b(InputStream inputStream, List list, wo0 wo0Var) {
            this.f55301b = (wo0) bgd.m18886d(wo0Var);
            this.f55302c = (List) bgd.m18886d(list);
            this.f55300a = new C10734c(inputStream, wo0Var);
        }

        @Override // p001o.yd8
        /* renamed from: a */
        public Bitmap mo57624a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f55300a.mo12701c(), null, options);
        }

        @Override // p001o.yd8
        /* renamed from: b */
        public void mo57625b() {
            this.f55300a.m12708a();
        }

        @Override // p001o.yd8
        /* renamed from: c */
        public int mo57626c() {
            return AbstractC10730a.m12690b(this.f55302c, this.f55300a.mo12701c(), this.f55301b);
        }

        @Override // p001o.yd8
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo57627d() {
            return AbstractC10730a.m12694f(this.f55302c, this.f55300a.mo12701c(), this.f55301b);
        }
    }

    /* renamed from: o.yd8$c */
    public static final class C18384c implements yd8 {

        /* renamed from: a */
        public final wo0 f55303a;

        /* renamed from: b */
        public final List f55304b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f55305c;

        public C18384c(ParcelFileDescriptor parcelFileDescriptor, List list, wo0 wo0Var) {
            this.f55303a = (wo0) bgd.m18886d(wo0Var);
            this.f55304b = (List) bgd.m18886d(list);
            this.f55305c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p001o.yd8
        /* renamed from: a */
        public Bitmap mo57624a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f55305c.mo12701c().getFileDescriptor(), null, options);
        }

        @Override // p001o.yd8
        /* renamed from: b */
        public void mo57625b() {
        }

        @Override // p001o.yd8
        /* renamed from: c */
        public int mo57626c() {
            return AbstractC10730a.m12689a(this.f55304b, this.f55305c, this.f55303a);
        }

        @Override // p001o.yd8
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo57627d() {
            return AbstractC10730a.m12693e(this.f55304b, this.f55305c, this.f55303a);
        }
    }

    /* renamed from: a */
    Bitmap mo57624a(BitmapFactory.Options options);

    /* renamed from: b */
    void mo57625b();

    /* renamed from: c */
    int mo57626c();

    /* renamed from: d */
    ImageHeaderParser.ImageType mo57627d();
}
