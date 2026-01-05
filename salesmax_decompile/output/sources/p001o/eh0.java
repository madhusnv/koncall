package p001o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.AbstractC10730a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class eh0 {

    /* renamed from: a */
    public final List f21605a;

    /* renamed from: b */
    public final wo0 f21606b;

    /* renamed from: o.eh0$a */
    public static final class C13187a implements zne {

        /* renamed from: a */
        public final AnimatedImageDrawable f21607a;

        public C13187a(AnimatedImageDrawable animatedImageDrawable) {
            this.f21607a = animatedImageDrawable;
        }

        @Override // p001o.zne
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AnimatedImageDrawable get() {
            return this.f21607a;
        }

        @Override // p001o.zne
        /* renamed from: b */
        public void mo19618b() {
            this.f21607a.stop();
            this.f21607a.clearAnimationCallbacks();
        }

        @Override // p001o.zne
        /* renamed from: j */
        public int mo19619j() {
            return this.f21607a.getIntrinsicWidth() * this.f21607a.getIntrinsicHeight() * uqi.m51927h(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p001o.zne
        /* renamed from: k */
        public Class mo19620k() {
            return Drawable.class;
        }
    }

    /* renamed from: o.eh0$b */
    public static final class C13188b implements ioe {

        /* renamed from: a */
        public final eh0 f21608a;

        public C13188b(eh0 eh0Var) {
            this.f21608a = eh0Var;
        }

        @Override // p001o.ioe
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public zne mo16416b(ByteBuffer byteBuffer, int i, int i2, rec recVar) {
            return this.f21608a.m25005b(ImageDecoder.createSource(byteBuffer), i, i2, recVar);
        }

        @Override // p001o.ioe
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo16415a(ByteBuffer byteBuffer, rec recVar) {
            return this.f21608a.m25007d(byteBuffer);
        }
    }

    /* renamed from: o.eh0$c */
    public static final class C13189c implements ioe {

        /* renamed from: a */
        public final eh0 f21609a;

        public C13189c(eh0 eh0Var) {
            this.f21609a = eh0Var;
        }

        @Override // p001o.ioe
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public zne mo16416b(InputStream inputStream, int i, int i2, rec recVar) {
            return this.f21609a.m25005b(ImageDecoder.createSource(fq1.m27328b(inputStream)), i, i2, recVar);
        }

        @Override // p001o.ioe
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean mo16415a(InputStream inputStream, rec recVar) {
            return this.f21609a.m25006c(inputStream);
        }
    }

    public eh0(List list, wo0 wo0Var) {
        this.f21605a = list;
        this.f21606b = wo0Var;
    }

    /* renamed from: a */
    public static ioe m25003a(List list, wo0 wo0Var) {
        return new C13188b(new eh0(list, wo0Var));
    }

    /* renamed from: f */
    public static ioe m25004f(List list, wo0 wo0Var) {
        return new C13189c(new eh0(list, wo0Var));
    }

    /* renamed from: b */
    public zne m25005b(ImageDecoder.Source source, int i, int i2, rec recVar) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new vf5(i, i2, recVar));
        if (yg0.m57770a(drawableDecodeDrawable)) {
            return new C13187a(zg0.m59382a(drawableDecodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + drawableDecodeDrawable);
    }

    /* renamed from: c */
    public boolean m25006c(InputStream inputStream) {
        return m25008e(AbstractC10730a.m12694f(this.f21605a, inputStream, this.f21606b));
    }

    /* renamed from: d */
    public boolean m25007d(ByteBuffer byteBuffer) {
        return m25008e(AbstractC10730a.m12695g(this.f21605a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean m25008e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}
