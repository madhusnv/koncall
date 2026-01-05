package p001o;

import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class uf8 {

    /* renamed from: a */
    public final Fragment f48880a;

    /* renamed from: b */
    public final int f48881b;

    /* renamed from: c */
    public String f48882c;

    /* renamed from: d */
    public InterfaceC17374a f48883d;

    /* renamed from: e */
    public final int f48884e;

    /* renamed from: f */
    public final ws f48885f;

    /* renamed from: g */
    public final ws f48886g;

    /* renamed from: o.uf8$a */
    public interface InterfaceC17374a {
        /* renamed from: a */
        void mo955a(Uri uri);

        /* renamed from: b */
        void mo956b();

        /* renamed from: c */
        void mo957c();
    }

    public uf8(Fragment fragment) {
        sq8.m48649h(fragment, "fragment");
        this.f48880a = fragment;
        this.f48881b = 101;
        this.f48882c = "";
        this.f48884e = 26214400;
        ws wsVarRegisterForActivityResult = fragment.registerForActivityResult(new us(), new ns() { // from class: o.sf8
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                uf8.m51536h(this.f45341a, (ActivityResult) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.f48885f = wsVarRegisterForActivityResult;
        ws wsVarRegisterForActivityResult2 = fragment.registerForActivityResult(new ss(), new ns() { // from class: o.tf8
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                uf8.m51534e(this.f46995a, (Map) obj);
            }
        });
        sq8.m48648g(wsVarRegisterForActivityResult2, "registerForActivityResult(...)");
        this.f48886g = wsVarRegisterForActivityResult2;
    }

    /* renamed from: d */
    public static /* synthetic */ void m51533d(uf8 uf8Var, InterfaceC17374a interfaceC17374a, String[] strArr, int i, Object obj) {
        if ((i & 2) != 0) {
            strArr = new String[0];
        }
        uf8Var.m51537c(interfaceC17374a, strArr);
    }

    /* renamed from: e */
    public static final void m51534e(uf8 uf8Var, Map map) {
        boolean z;
        sq8.m48649h(uf8Var, "this$0");
        Set setEntrySet = map.entrySet();
        if ((setEntrySet instanceof Collection) && setEntrySet.isEmpty()) {
            z = true;
        } else {
            Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                z = false;
                if (!(((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue())) {
                    break;
                }
            }
            z = true;
        }
        if (z) {
            m51535g(uf8Var, null, 1, null);
            return;
        }
        InterfaceC17374a interfaceC17374a = uf8Var.f48883d;
        if (interfaceC17374a != null) {
            interfaceC17374a.mo957c();
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m51535g(uf8 uf8Var, String[] strArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = new String[0];
        }
        uf8Var.m51538f(strArr);
    }

    /* renamed from: h */
    public static final void m51536h(uf8 uf8Var, ActivityResult activityResult) {
        sq8.m48649h(uf8Var, "this$0");
        if (activityResult.m3726b() == -1) {
            Intent intentM3725a = activityResult.m3725a();
            Intent intentM3725a2 = activityResult.m3725a();
            String.valueOf(intentM3725a2 != null ? intentM3725a2.getData() : null);
            if (intentM3725a == null || intentM3725a.getData() == null) {
                InterfaceC17374a interfaceC17374a = uf8Var.f48883d;
                if (interfaceC17374a != null) {
                    interfaceC17374a.mo956b();
                }
                Intent intentM3725a3 = activityResult.m3725a();
                String.valueOf(intentM3725a3 != null ? intentM3725a3.getData() : null);
                return;
            }
            Uri data = intentM3725a.getData();
            sq8.m48646e(data);
            data.toString();
            ContentResolver contentResolver = uf8Var.f48880a.requireContext().getContentResolver();
            sq8.m48648g(contentResolver, "getContentResolver(...)");
            if (jm7.m34030P(contentResolver, data) <= uf8Var.f48884e) {
                InterfaceC17374a interfaceC17374a2 = uf8Var.f48883d;
                if (interfaceC17374a2 != null) {
                    interfaceC17374a2.mo955a(data);
                    return;
                }
                return;
            }
            jm7.v0(uf8Var.f48880a.requireActivity(), "There is overall limit of 25MB per file in Salesmax", 0, 0, 12, null);
            InterfaceC17374a interfaceC17374a3 = uf8Var.f48883d;
            if (interfaceC17374a3 != null) {
                interfaceC17374a3.mo956b();
            }
        }
    }

    /* renamed from: c */
    public final void m51537c(InterfaceC17374a interfaceC17374a, String[] strArr) {
        sq8.m48649h(strArr, "allowedMimeTypes");
        this.f48883d = interfaceC17374a;
        if (j4d.m33233v(this.f48880a.requireActivity())) {
            m51538f(strArr);
            return;
        }
        ws wsVar = this.f48886g;
        List list = j4d.f29770A;
        sq8.m48648g(list, "READ_EXTERNAL_STORAGE_PERMISSIONS");
        wsVar.m54945b(list.toArray(new String[0]));
    }

    /* renamed from: f */
    public final void m51538f(String[] strArr) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        if (!(strArr.length == 0)) {
            intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
        }
        this.f48885f.m54945b(Intent.createChooser(intent, "Select File"));
    }
}
