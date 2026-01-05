package p001o;

import ai.salesmax.AbstractC0059a;
import android.content.Intent;
import android.widget.EditText;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class l9f {

    /* renamed from: a */
    public final Fragment f33512a;

    /* renamed from: b */
    public final InterfaceC15044a f33513b;

    /* renamed from: c */
    public final WeakReference f33514c;

    /* renamed from: d */
    public final Fragment f33515d;

    /* renamed from: e */
    public EditText f33516e;

    /* renamed from: f */
    public final ws f33517f;

    /* renamed from: o.l9f$a */
    public interface InterfaceC15044a {
        /* renamed from: a */
        void mo701a(String str);
    }

    public l9f(Fragment fragment, InterfaceC15044a interfaceC15044a) {
        sq8.m48649h(fragment, "fragment");
        this.f33512a = fragment;
        this.f33513b = interfaceC15044a;
        WeakReference weakReference = new WeakReference(fragment);
        this.f33514c = weakReference;
        Fragment fragment2 = (Fragment) weakReference.get();
        this.f33515d = fragment2;
        this.f33517f = fragment2 != null ? fragment2.registerForActivityResult(new us(), new ns() { // from class: o.k9f
            @Override // p001o.ns
            /* renamed from: a */
            public final void mo6217a(Object obj) {
                l9f.m36817b(this.f31712a, (ActivityResult) obj);
            }
        }) : null;
    }

    /* renamed from: b */
    public static final void m36817b(l9f l9fVar, ActivityResult activityResult) {
        Intent intentM3725a;
        ArrayList<String> stringArrayListExtra;
        sq8.m48649h(l9fVar, "this$0");
        if (activityResult.m3726b() != -1 || (intentM3725a = activityResult.m3725a()) == null || (stringArrayListExtra = intentM3725a.getStringArrayListExtra("android.speech.extra.RESULTS")) == null || !(!stringArrayListExtra.isEmpty())) {
            return;
        }
        InterfaceC15044a interfaceC15044a = l9fVar.f33513b;
        if (interfaceC15044a != null) {
            String str = stringArrayListExtra.get(0);
            sq8.m48648g(str, "get(...)");
            interfaceC15044a.mo701a(str);
        }
        EditText editText = l9fVar.f33516e;
        if (editText != null) {
            String string = f9g.Z0(editText.getText().toString()).toString();
            if (!(!f9g.d0(string))) {
                String str2 = ((Object) stringArrayListExtra.get(0)) + " ";
                EditText editText2 = l9fVar.f33516e;
                if (editText2 != null) {
                    editText2.setText(str2);
                }
                editText.setSelection(str2.length());
                return;
            }
            String str3 = string + " " + ((Object) stringArrayListExtra.get(0)) + " ";
            EditText editText3 = l9fVar.f33516e;
            if (editText3 != null) {
                editText3.setText(str3);
            }
            editText.setSelection(str3.length());
        }
    }

    /* renamed from: c */
    public final void m36818c(EditText editText) {
        this.f33516e = editText;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: d */
    public final void m36819d() {
        String strM3234V = AbstractC0059a.m132a().m3234V();
        String str = "en-US";
        if (strM3234V != null) {
            String lowerCase = strM3234V.toLowerCase();
            sq8.m48648g(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1603757456:
                    lowerCase.equals("english");
                    break;
                case -939365560:
                    if (lowerCase.equals("kannada")) {
                        str = "kn_IN";
                        break;
                    }
                    break;
                case -877376984:
                    if (lowerCase.equals("telugu")) {
                        str = "te-IN";
                        break;
                    }
                    break;
                case -222655774:
                    if (lowerCase.equals("bengali")) {
                        str = "bn-IN";
                        break;
                    }
                    break;
                case 99283154:
                    if (lowerCase.equals("hindi")) {
                        str = "hi-IN";
                        break;
                    }
                    break;
                case 110126275:
                    if (lowerCase.equals("tamil")) {
                        str = "ta-IN";
                        break;
                    }
                    break;
                case 838966994:
                    if (lowerCase.equals("marathi")) {
                        str = "mr-IN";
                        break;
                    }
                    break;
            }
        }
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", Locale.getDefault());
        intent.putExtra("android.speech.extra.LANGUAGE", str);
        intent.putExtra("android.speech.extra.LANGUAGE_PREFERENCE", str);
        intent.putExtra("android.speech.extra.ONLY_RETURN_LANGUAGE_PREFERENCE", str);
        intent.putExtra("android.speech.extra.PROMPT", "Voice Search");
        Intent intentCreateChooser = Intent.createChooser(intent, "Select voice search");
        ws wsVar = this.f33517f;
        if (wsVar != null) {
            wsVar.m54945b(intentCreateChooser);
        }
    }

    public /* synthetic */ l9f(Fragment fragment, InterfaceC15044a interfaceC15044a, int i, id5 id5Var) {
        this(fragment, (i & 2) != 0 ? null : interfaceC15044a);
    }
}
