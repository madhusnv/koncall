package p001o;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p001o.n24;

/* loaded from: classes2.dex */
public abstract class gj8 {

    /* renamed from: o.gj8$a */
    public class C13748a extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC13750c f25324a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13748a(InputConnection inputConnection, boolean z, InterfaceC13750c interfaceC13750c) {
            super(inputConnection, z);
            this.f25324a = interfaceC13750c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
            if (this.f25324a.mo26906a(hj8.m30659f(inputContentInfo), i, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i, bundle);
        }
    }

    /* renamed from: o.gj8$b */
    public class C13749b extends InputConnectionWrapper {

        /* renamed from: a */
        public final /* synthetic */ InterfaceC13750c f25325a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13749b(InputConnection inputConnection, boolean z, InterfaceC13750c interfaceC13750c) {
            super(inputConnection, z);
            this.f25325a = interfaceC13750c;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (gj8.m28858e(str, bundle, this.f25325a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: o.gj8$c */
    public interface InterfaceC13750c {
        /* renamed from: a */
        boolean mo26906a(hj8 hj8Var, int i, Bundle bundle);
    }

    /* renamed from: b */
    public static InterfaceC13750c m28855b(final View view) {
        fgd.m26663g(view);
        return new InterfaceC13750c() { // from class: o.fj8
            @Override // p001o.gj8.InterfaceC13750c
            /* renamed from: a */
            public final boolean mo26906a(hj8 hj8Var, int i, Bundle bundle) {
                return gj8.m28859f(view, hj8Var, i, bundle);
            }
        };
    }

    /* renamed from: c */
    public static InputConnection m28856c(View view, InputConnection inputConnection, EditorInfo editorInfo) {
        return m28857d(inputConnection, editorInfo, m28855b(view));
    }

    /* renamed from: d */
    public static InputConnection m28857d(InputConnection inputConnection, EditorInfo editorInfo, InterfaceC13750c interfaceC13750c) {
        s6c.m47912d(inputConnection, "inputConnection must be non-null");
        s6c.m47912d(editorInfo, "editorInfo must be non-null");
        s6c.m47912d(interfaceC13750c, "onCommitContentListener must be non-null");
        return Build.VERSION.SDK_INT >= 25 ? new C13748a(inputConnection, false, interfaceC13750c) : i46.m31484a(editorInfo).length == 0 ? inputConnection : new C13749b(inputConnection, false, interfaceC13750c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: e */
    public static boolean m28858e(String str, Bundle bundle, InterfaceC13750c interfaceC13750c) throws Throwable {
        boolean z;
        ResultReceiver resultReceiver;
        ?? Mo26906a = 0;
        Mo26906a = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z = true;
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER");
            try {
                Uri uri = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI");
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION");
                Uri uri2 = (Uri) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI");
                int i = bundle.getInt(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS");
                Bundle bundle2 = (Bundle) bundle.getParcelable(z ? "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS" : "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS");
                if (uri != null && clipDescription != null) {
                    Mo26906a = interfaceC13750c.mo26906a(new hj8(uri, clipDescription, uri2), i, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(Mo26906a, null);
                }
                return Mo26906a;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ boolean m28859f(View view, hj8 hj8Var, int i, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                hj8Var.m30663d();
                Parcelable parcelable = (Parcelable) hj8Var.m30664e();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        return wvi.c0(view, new n24.C15473a(new ClipData(hj8Var.m30661b(), new ClipData.Item(hj8Var.m30660a())), 2).m40015d(hj8Var.m30662c()).m40013b(bundle).m40012a()) == null;
    }
}
