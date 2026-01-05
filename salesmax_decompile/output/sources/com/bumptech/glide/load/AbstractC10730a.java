package com.bumptech.glide.load;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import p001o.fq1;
import p001o.wo0;
import p001o.xfe;

/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes5.dex */
public abstract class AbstractC10730a {

    /* renamed from: com.bumptech.glide.load.a$a */
    public class a implements h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f11200a;

        public a(InputStream inputStream) {
            this.f11200a = inputStream;
        }

        @Override // com.bumptech.glide.load.AbstractC10730a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo12697a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo12688d(this.f11200a);
            } finally {
                this.f11200a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    public class b implements h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f11201a;

        public b(ByteBuffer byteBuffer) {
            this.f11201a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.AbstractC10730a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo12697a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo12686b(this.f11201a);
            } finally {
                fq1.m27330d(this.f11201a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    public class c implements h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f11202a;

        /* renamed from: b */
        public final /* synthetic */ wo0 f11203b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, wo0 wo0Var) {
            this.f11202a = parcelFileDescriptorRewinder;
            this.f11203b = wo0Var;
        }

        @Override // com.bumptech.glide.load.AbstractC10730a.h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo12697a(ImageHeaderParser imageHeaderParser) throws Throwable {
            xfe xfeVar = null;
            try {
                xfe xfeVar2 = new xfe(new FileInputStream(this.f11202a.mo12701c().getFileDescriptor()), this.f11203b);
                try {
                    ImageHeaderParser.ImageType imageTypeMo12688d = imageHeaderParser.mo12688d(xfeVar2);
                    xfeVar2.release();
                    this.f11202a.mo12701c();
                    return imageTypeMo12688d;
                } catch (Throwable th) {
                    th = th;
                    xfeVar = xfeVar2;
                    if (xfeVar != null) {
                        xfeVar.release();
                    }
                    this.f11202a.mo12701c();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    public class d implements g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f11204a;

        /* renamed from: b */
        public final /* synthetic */ wo0 f11205b;

        public d(ByteBuffer byteBuffer, wo0 wo0Var) {
            this.f11204a = byteBuffer;
            this.f11205b = wo0Var;
        }

        @Override // com.bumptech.glide.load.AbstractC10730a.g
        /* renamed from: a */
        public int mo12698a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.mo12685a(this.f11204a, this.f11205b);
            } finally {
                fq1.m27330d(this.f11204a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    public class e implements g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f11206a;

        /* renamed from: b */
        public final /* synthetic */ wo0 f11207b;

        public e(InputStream inputStream, wo0 wo0Var) {
            this.f11206a = inputStream;
            this.f11207b = wo0Var;
        }

        @Override // com.bumptech.glide.load.AbstractC10730a.g
        /* renamed from: a */
        public int mo12698a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo12687c(this.f11206a, this.f11207b);
            } finally {
                this.f11206a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    public class f implements g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f11208a;

        /* renamed from: b */
        public final /* synthetic */ wo0 f11209b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, wo0 wo0Var) {
            this.f11208a = parcelFileDescriptorRewinder;
            this.f11209b = wo0Var;
        }

        @Override // com.bumptech.glide.load.AbstractC10730a.g
        /* renamed from: a */
        public int mo12698a(ImageHeaderParser imageHeaderParser) throws Throwable {
            xfe xfeVar = null;
            try {
                xfe xfeVar2 = new xfe(new FileInputStream(this.f11208a.mo12701c().getFileDescriptor()), this.f11209b);
                try {
                    int iMo12687c = imageHeaderParser.mo12687c(xfeVar2, this.f11209b);
                    xfeVar2.release();
                    this.f11208a.mo12701c();
                    return iMo12687c;
                } catch (Throwable th) {
                    th = th;
                    xfeVar = xfeVar2;
                    if (xfeVar != null) {
                        xfeVar.release();
                    }
                    this.f11208a.mo12701c();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    public interface g {
        /* renamed from: a */
        int mo12698a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    public interface h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo12697a(ImageHeaderParser imageHeaderParser);
    }

    /* renamed from: a */
    public static int m12689a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, wo0 wo0Var) {
        return m12692d(list, new f(parcelFileDescriptorRewinder, wo0Var));
    }

    /* renamed from: b */
    public static int m12690b(List list, InputStream inputStream, wo0 wo0Var) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new xfe(inputStream, wo0Var);
        }
        inputStream.mark(TransferRecord.MINIMUM_UPLOAD_PART_SIZE);
        return m12692d(list, new e(inputStream, wo0Var));
    }

    /* renamed from: c */
    public static int m12691c(List list, ByteBuffer byteBuffer, wo0 wo0Var) {
        if (byteBuffer == null) {
            return -1;
        }
        return m12692d(list, new d(byteBuffer, wo0Var));
    }

    /* renamed from: d */
    public static int m12692d(List list, g gVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iMo12698a = gVar.mo12698a((ImageHeaderParser) list.get(i));
            if (iMo12698a != -1) {
                return iMo12698a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m12693e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, wo0 wo0Var) {
        return m12696h(list, new c(parcelFileDescriptorRewinder, wo0Var));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m12694f(List list, InputStream inputStream, wo0 wo0Var) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new xfe(inputStream, wo0Var);
        }
        inputStream.mark(TransferRecord.MINIMUM_UPLOAD_PART_SIZE);
        return m12696h(list, new a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m12695g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : m12696h(list, new b(byteBuffer));
    }

    /* renamed from: h */
    public static ImageHeaderParser.ImageType m12696h(List list, h hVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeMo12697a = hVar.mo12697a((ImageHeaderParser) list.get(i));
            if (imageTypeMo12697a != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeMo12697a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
