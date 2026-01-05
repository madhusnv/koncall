package rn;

import aws.sdk.kotlin.services.s3.model.S3Exception;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.kotlin.storage.Storage;
import com.amplifyframework.storage.StorageException;
import com.amplifyframework.storage.result.StorageUploadFileResult;
import ex.InterfaceC2141e;
import java.io.File;
import kotlin.jvm.internal.AbstractC4154l;
import kotlin.jvm.internal.C4164v;
import og.od;
import tx.InterfaceC7266z;
import uw.InterfaceC7559c;
import vw.EnumC7794a;
import ww.AbstractC8199i;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* renamed from: rn.n */
/* loaded from: classes3.dex */
public final class C6585n extends AbstractC8199i implements InterfaceC2141e {

    /* renamed from: a */
    public int f31592a;

    /* renamed from: b */
    public final /* synthetic */ C4164v f31593b;

    /* renamed from: c */
    public final /* synthetic */ h0 f31594c;

    /* renamed from: d */
    public final /* synthetic */ File f31595d;

    /* renamed from: e */
    public final /* synthetic */ Storage.InProgressStorageOperation f31596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6585n(C4164v c4164v, h0 h0Var, File file, Storage.InProgressStorageOperation inProgressStorageOperation, InterfaceC7559c interfaceC7559c) {
        super(2, interfaceC7559c);
        this.f31593b = c4164v;
        this.f31594c = h0Var;
        this.f31595d = file;
        this.f31596e = inProgressStorageOperation;
    }

    @Override // ww.AbstractC8191a
    public final InterfaceC7559c create(Object obj, InterfaceC7559c interfaceC7559c) {
        return new C6585n(this.f31593b, this.f31594c, this.f31595d, this.f31596e, interfaceC7559c);
    }

    @Override // ex.InterfaceC2141e
    public final Object invoke(Object obj, Object obj2) {
        return ((C6585n) create((InterfaceC7266z) obj, (InterfaceC7559c) obj2)).invokeSuspend(qw.a0.f30746a);
    }

    @Override // ww.AbstractC8191a
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC7794a enumC7794a = EnumC7794a.COROUTINE_SUSPENDED;
        int i10 = this.f31592a;
        File file = this.f31595d;
        h0 h0Var = this.f31594c;
        C4164v c4164v = this.f31593b;
        try {
            if (i10 == 0) {
                od.m10798c(obj);
                c4164v.f21160a = true;
                h0Var.m12616i("fileUploadOperation >>> started: " + file.getName(), null);
                Storage.InProgressStorageOperation inProgressStorageOperation = this.f31596e;
                this.f31592a = 1;
                obj = inProgressStorageOperation.result(this);
                if (obj == enumC7794a) {
                    return enumC7794a;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od.m10798c(obj);
            }
            String path = ((StorageUploadFileResult) obj).getPath();
            AbstractC4154l.m8922e(path, "getPath(...)");
            h0Var.m12616i("fileUploadOperation >>> finished: " + file.getName(), null);
            c4164v.f21160a = false;
            return path;
        } catch (StorageException e2) {
            e2.printStackTrace();
            if (e2.getCause() != null) {
                Throwable cause = e2.getCause();
                if ((cause != null ? cause.getCause() : null) instanceof S3Exception) {
                    Throwable cause2 = e2.getCause();
                    AbstractC4154l.m8920c(cause2);
                    Throwable cause3 = cause2.getCause();
                    AbstractC4154l.m8920c(cause3);
                    throw cause3;
                }
                if (e2.getCause() instanceof AuthException) {
                    Throwable cause4 = e2.getCause();
                    AbstractC4154l.m8920c(cause4);
                    throw cause4;
                }
                Throwable cause5 = e2.getCause();
                if ((cause5 != null ? cause5.getCause() : null) instanceof AuthException) {
                    Throwable cause6 = e2.getCause();
                    AbstractC4154l.m8920c(cause6);
                    Throwable cause7 = cause6.getCause();
                    AbstractC4154l.m8920c(cause7);
                    throw cause7;
                }
            }
            throw e2;
        }
    }
}
