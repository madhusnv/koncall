package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.InterfaceC10732a;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class ParcelFileDescriptorRewinder implements InterfaceC10732a {

    /* renamed from: a */
    public final InternalRewinder f11210a;

    public static final class InternalRewinder {

        /* renamed from: a */
        public final ParcelFileDescriptor f11211a;

        public InternalRewinder(ParcelFileDescriptor parcelFileDescriptor) {
            this.f11211a = parcelFileDescriptor;
        }

        public ParcelFileDescriptor rewind() throws IOException, ErrnoException {
            try {
                Os.lseek(this.f11211a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f11211a;
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$a */
    public static final class C10731a implements InterfaceC10732a.a {
        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: a */
        public Class mo12703a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC10732a mo12704b(ParcelFileDescriptor parcelFileDescriptor) {
            return new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor parcelFileDescriptor) {
        this.f11210a = new InternalRewinder(parcelFileDescriptor);
    }

    /* renamed from: a */
    public static boolean m12699a() {
        return !"robolectric".equals(Build.FINGERPRINT);
    }

    @Override // com.bumptech.glide.load.data.InterfaceC10732a
    /* renamed from: b */
    public void mo12700b() {
    }

    @Override // com.bumptech.glide.load.data.InterfaceC10732a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor mo12701c() {
        return this.f11210a.rewind();
    }
}
