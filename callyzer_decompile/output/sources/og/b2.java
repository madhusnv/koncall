package og;

import ap.C0390c;
import c3.C0848c;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.CheckBox;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.DropDownBox;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.DynamicComponents;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.InputBox;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.LeadFormResponse;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.Options;
import com.websoptimization.callyzerbiz.data.model.response.lead_form_response.RadioBox;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC4154l;
import nr.AbstractC5134a;
import or.AbstractC5453p;
import or.C5438a;
import or.C5439b;
import or.C5440c;
import or.C5441d;
import or.C5443f;
import or.C5444g;
import or.C5446i;
import or.C5447j;
import or.C5449l;
import or.C5450m;
import or.C5451n;
import or.C5452o;
import or.C5454q;
import rw.AbstractC6664n;
import rw.AbstractC6666p;

/* compiled from: r8-map-id-9a0e3898ebce267aa93fdb2b9ae0dadacb352c01d7a13c4da957b245de4f18d9 */
/* loaded from: classes.dex */
public abstract class b2 {
    /* renamed from: a */
    public static final C0848c m10543a(long j6, long j10) {
        int i10 = (int) (j6 >> 32);
        int i11 = (int) (j6 & 4294967295L);
        return new C0848c(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11), Float.intBitsToFloat((int) (j10 >> 32)) + Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j10 & 4294967295L)) + Float.intBitsToFloat(i11));
    }

    /* renamed from: b */
    public static final C5439b m10544b(LeadFormResponse leadFormResponse, boolean z6) {
        AbstractC5453p c5443f;
        C5438a c5438a;
        AbstractC4154l.m8923f(leadFormResponse, "<this>");
        ArrayList arrayList = new ArrayList();
        DynamicComponents dynamicComponentsM4971a = leadFormResponse.m4971a();
        for (InputBox inputBox : dynamicComponentsM4971a.m4963c()) {
            switch (AbstractC5134a.f25136a[inputBox.m4965a().m4945b().ordinal()]) {
                case 1:
                    String strM4944a = inputBox.m4965a().m4944a();
                    if (strM4944a == null) {
                        strM4944a = "";
                    }
                    String str = strM4944a;
                    LocalDate localDateM4949f = inputBox.m4965a().m4949f();
                    LocalDateTime localDateTimeAtStartOfDay = localDateM4949f != null ? localDateM4949f.atStartOfDay() : null;
                    LocalDate localDateM4946c = inputBox.m4965a().m4946c();
                    c5438a = new C5438a(new C5441d(str, localDateTimeAtStartOfDay, localDateM4946c != null ? localDateM4946c.atStartOfDay() : null, inputBox.m4967c(), -1L, inputBox.m4970f(), inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), null, false), false);
                    break;
                case 2:
                    c5438a = new C5438a(new C5446i(inputBox.m4965a().m4947d(), inputBox.m4965a().m4950g(), inputBox.m4965a().m4953j(), inputBox.m4965a().m4951h(), inputBox.m4965a().m4948e(), false, "", inputBox.m4967c(), inputBox.m4970f(), inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), (String) null, false, 16385), false);
                    break;
                case 3:
                    c5438a = new C5438a(new C5449l(inputBox.m4965a().m4947d(), inputBox.m4965a().m4950g(), inputBox.m4965a().m4953j(), inputBox.m4965a().m4951h(), inputBox.m4965a().m4948e(), false, "", inputBox.m4967c(), inputBox.m4970f(), inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), false, 16385), false);
                    break;
                case 4:
                    c5438a = new C5438a(new C5451n(inputBox.m4965a().m4947d(), inputBox.m4965a().m4950g(), inputBox.m4965a().m4953j(), inputBox.m4965a().m4951h(), inputBox.m4965a().m4948e(), "", inputBox.m4967c(), inputBox.m4970f(), inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), null, false), false);
                    break;
                case 5:
                    c5438a = new C5438a(new C5444g(inputBox.m4965a().m4947d(), inputBox.m4965a().m4950g(), inputBox.m4965a().m4953j(), "", inputBox.m4967c(), inputBox.m4970f(), inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), null, false), false);
                    break;
                case 6:
                    c5438a = new C5438a(new C5452o(inputBox.m4965a().m4947d(), inputBox.m4965a().m4950g(), inputBox.m4965a().m4953j(), "", inputBox.m4967c(), inputBox.m4970f(), inputBox.m4969e(), inputBox.m4968d(), inputBox.m4966b(), null, false), false);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            arrayList.add(c5438a);
        }
        for (RadioBox radioBox : dynamicComponentsM4971a.m4964d()) {
            String strM4978c = radioBox.m4978c();
            boolean zM4981f = radioBox.m4981f();
            String strM4980e = radioBox.m4980e();
            int iM4977b = radioBox.m4977b();
            String strM4979d = radioBox.m4979d();
            List<Options> listM4952i = radioBox.m4976a().m4952i();
            ArrayList arrayList2 = new ArrayList(AbstractC6664n.m12768r(listM4952i, 10));
            for (Options options : listM4952i) {
                arrayList2.add(new C5454q(options.m4973a(), options.m4974b(), z6 ? options.m4975c() : false));
            }
            arrayList.add(new C5438a(new C5450m(iM4977b, strM4978c, strM4980e, strM4979d, null, arrayList2, zM4981f, false), false));
        }
        for (DropDownBox dropDownBox : dynamicComponentsM4971a.m4962b()) {
            List<Options> listM4952i2 = dropDownBox.m4955a().m4952i();
            ArrayList arrayList3 = new ArrayList(AbstractC6664n.m12768r(listM4952i2, 10));
            for (Options options2 : listM4952i2) {
                arrayList3.add(new C5454q(options2.m4973a(), options2.m4974b(), z6 ? options2.m4975c() : false));
            }
            if (dropDownBox.m4955a().m4954k()) {
                c5443f = new C5447j(dropDownBox.m4956b(), dropDownBox.m4957c(), dropDownBox.m4959e(), dropDownBox.m4958d(), null, arrayList3, dropDownBox.m4960f(), false);
            } else {
                ArrayList arrayList4 = new ArrayList();
                arrayList4.add(new C5454q(i0.m0.m7378k("Select ", dropDownBox.m4958d()), i0.m0.m7378k("select ", dropDownBox.m4958d()), false));
                arrayList4.addAll(arrayList3);
                c5443f = new C5443f(dropDownBox.m4956b(), dropDownBox.m4957c(), dropDownBox.m4959e(), dropDownBox.m4958d(), null, arrayList4, dropDownBox.m4960f(), false);
            }
            arrayList.add(new C5438a(c5443f, false));
        }
        for (CheckBox checkBox : dynamicComponentsM4971a.m4961a()) {
            String strM4940c = checkBox.m4940c();
            boolean zM4943f = checkBox.m4943f();
            String strM4942e = checkBox.m4942e();
            int iM4939b = checkBox.m4939b();
            String strM4941d = checkBox.m4941d();
            List<Options> listM4952i3 = checkBox.m4938a().m4952i();
            ArrayList arrayList5 = new ArrayList(AbstractC6664n.m12768r(listM4952i3, 10));
            for (Options options3 : listM4952i3) {
                arrayList5.add(new C5454q(options3.m4973a(), options3.m4974b(), z6 ? options3.m4975c() : false));
            }
            arrayList.add(new C5438a(new C5440c(false, strM4940c, arrayList5, zM4943f, strM4942e, strM4941d, iM4939b, null, false), false));
        }
        if (arrayList.size() > 1) {
            AbstractC6666p.m12771u(arrayList, new C0390c(22));
        }
        return new C5439b(leadFormResponse.m4972b(), arrayList);
    }
}
