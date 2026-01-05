package com.bumptech.glide.load.data;

import com.amplifyframework.storage.s3.transfer.TransferRecord;
import com.bumptech.glide.load.data.InterfaceC10732a;
import java.io.InputStream;
import p001o.wo0;
import p001o.xfe;

/* renamed from: com.bumptech.glide.load.data.c */
/* loaded from: classes5.dex */
public final class C10734c implements InterfaceC10732a {

    /* renamed from: a */
    public final xfe f11215a;

    /* renamed from: com.bumptech.glide.load.data.c$a */
    public static final class a implements InterfaceC10732a.a {

        /* renamed from: a */
        public final wo0 f11216a;

        public a(wo0 wo0Var) {
            this.f11216a = wo0Var;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: a */
        public Class mo12703a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.InterfaceC10732a.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC10732a mo12704b(InputStream inputStream) {
            return new C10734c(inputStream, this.f11216a);
        }
    }

    public C10734c(InputStream inputStream, wo0 wo0Var) {
        xfe xfeVar = new xfe(inputStream, wo0Var);
        this.f11215a = xfeVar;
        xfeVar.mark(TransferRecord.MINIMUM_UPLOAD_PART_SIZE);
    }

    /* renamed from: a */
    public void m12708a() {
        this.f11215a.m56224c();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC10732a
    /* renamed from: b */
    public void mo12700b() {
        this.f11215a.release();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC10732a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream mo12701c() {
        this.f11215a.reset();
        return this.f11215a;
    }
}
