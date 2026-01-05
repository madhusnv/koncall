package p001o;

import android.content.IntentSender;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult;
import p001o.xt7;

/* loaded from: classes2.dex */
public final class s4f {

    /* renamed from: a */
    public final Fragment f44807a;

    /* renamed from: b */
    public InterfaceC16741a f44808b;

    /* renamed from: c */
    public final ws f44809c;

    /* renamed from: o.s4f$a */
    public interface InterfaceC16741a {
        /* renamed from: a */
        void mo993a(Uri uri);

        /* renamed from: b */
        void mo994b();
    }

    /* renamed from: o.s4f$b */
    public static final class C16742b extends kf9 implements xk7 {
        public C16742b() {
            super(1);
        }

        /* renamed from: a */
        public final void m47837a(IntentSender intentSender) {
            ws wsVarM47834d = s4f.this.m47834d();
            sq8.m48646e(intentSender);
            wsVarM47834d.m54945b(new IntentSenderRequest.C1751a(intentSender).m3733a());
        }

        @Override // p001o.xk7
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m47837a((IntentSender) obj);
            return y3i.f54824a;
        }
    }

    public s4f(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        this.f44807a = fragment;
        ws wsVarRegisterForActivityResult = fragment.registerForActivityResult(new vs(), new ns() { // from class: o.p4f
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                s4f.m47831e(this.f39326a, (ActivityResult) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f44809c = wsVarRegisterForActivityResult;
    }

    /* renamed from: e */
    public static final void m47831e(s4f s4fVar, ActivityResult activityResult) {
        GmsDocumentScanningResult.Pdf pdfMo15794c;
        sq8.m48649h(s4fVar, "this$0");
        if (activityResult.m3726b() != -1) {
            InterfaceC16741a interfaceC16741a = s4fVar.f44808b;
            if (interfaceC16741a != null) {
                interfaceC16741a.mo994b();
                return;
            }
            return;
        }
        GmsDocumentScanningResult gmsDocumentScanningResultM15791a = GmsDocumentScanningResult.m15791a(activityResult.m3725a());
        if (gmsDocumentScanningResultM15791a == null || (pdfMo15794c = gmsDocumentScanningResultM15791a.mo15794c()) == null) {
            return;
        }
        Uri uriMo15797b = pdfMo15794c.mo15797b();
        sq8.m48648g(uriMo15797b, "getUri(...)");
        pdfMo15794c.mo15796a();
        InterfaceC16741a interfaceC16741a2 = s4fVar.f44808b;
        if (interfaceC16741a2 != null) {
            interfaceC16741a2.mo993a(uriMo15797b);
        }
    }

    /* renamed from: g */
    public static final void m47832g(xk7 xk7Var, Object obj) {
        sq8.m48649h(xk7Var, "$tmp0");
        xk7Var.invoke(obj);
    }

    /* renamed from: h */
    public static final void m47833h(Exception exc) {
        sq8.m48649h(exc, "it");
    }

    /* renamed from: d */
    public final ws m47834d() {
        return this.f44809c;
    }

    /* renamed from: f */
    public final void m47835f() {
        xt7 xt7VarM56827a = new xt7.C18245a().m56828b(false).m56829c(2).m56830d(102, new int[0]).m56831e(1).m56827a();
        sq8.m48648g(xt7VarM56827a, "build(...)");
        wt7 wt7VarM58199a = yt7.m58199a(xt7VarM56827a);
        sq8.m48648g(wt7VarM58199a, "getClient(...)");
        Task taskMo19218a = wt7VarM58199a.mo19218a(this.f44807a.requireActivity());
        final C16742b c16742b = new C16742b();
        taskMo19218a.addOnSuccessListener(new OnSuccessListener() { // from class: o.q4f
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                s4f.m47832g(c16742b, obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: o.r4f
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                s4f.m47833h(exc);
            }
        });
    }

    /* renamed from: i */
    public final void m47836i(InterfaceC16741a interfaceC16741a) {
        this.f44808b = interfaceC16741a;
        m47835f();
    }
}
