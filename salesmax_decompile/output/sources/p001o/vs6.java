package p001o;

import ai.salesmax.model.DistributionData;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: classes2.dex */
public abstract class vs6 {

    /* renamed from: a */
    public static final ArrayList f50807a = ch3.m21242g("Andy Thomas", "Derianto Kusuma", "Ben Kochavy", "Derianto Kusuma", "Bridgette Salley");

    /* renamed from: b */
    public static final ArrayList f50808b = ch3.m21242g("Founder", "CEO", "Developer", "Content Writer", "Manager");

    /* renamed from: c */
    public static final ArrayList f50809c = ch3.m21242g("Follow Up", "Client Office Visit", "Send Proposal", "Initial Discussion Kickstart");

    /* renamed from: d */
    public static final ArrayList f50810d = ch3.m21242g("To pick document from client office.", "Need to discuss on the negotiation of the proposal we have give.", "Pick document from Client Office", "Initial Discussion Kickstart");

    /* renamed from: e */
    public static final ArrayList f50811e = ch3.m21242g("1631458286042", "1632996096700", "1630261800000", "1632162600000", "1632940200000");

    /* renamed from: f */
    public static final ArrayList f50812f = ch3.m21242g("https://lh3.googleusercontent.com/6S1kp8BYVE2CfDn-q1ALl2T_A9DILsebI4XxArX-RUFpkJ3L_PrNAEC-jDWjQdo6QZEDcNbwE3hj6ffKeRB8h-_HKdmXhcnd7-bTNof_5VjRfKFsajVULQrOcrn2jxcsSAoMde3Fy-ZJ5Cql", "https://images.financialexpress.com/2021/07/Vijay-actor.jpg", "https://images.news18.com/ibnlive/uploads/2021/04/1618634140_pjimage-2021-04-17t100353.560.jpg", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTkJXGk9XHalMPnfIuSb5yZb8Xsz7TXeRmBOe1OVTwzoekbjaPIZxeh9Mcj5Jwy3g-slZo&usqp=CAU", "http://starsunfolded.com/wp-content/uploads/2017/04/Jai.jpg");

    /* renamed from: g */
    public static final ArrayList f50813g = ch3.m21242g("Tasks", "Calls", "Assigned", "Visits");

    /* renamed from: h */
    public static final ArrayList f50814h = ch3.m21242g("SuperFone", "Bosch", "Curvegraph", "Reccommendo", "Cognizant", "Kodak");

    /* renamed from: i */
    public static final ArrayList f50815i = ch3.m21242g("1234567890", "1234567891", "1234567892", "1234567893", "1234567894", "1234567895");

    /* renamed from: j */
    public static final ArrayList f50816j = ch3.m21242g("55 Calls Placed", "25 Tasks Completd", "30 Notes Added");

    /* renamed from: k */
    public static final ArrayList f50817k = ch3.m21242g(70, 20, 50, 99, 100, 0, 10, 33);

    /* renamed from: l */
    public static final ArrayList f50818l = ch3.m21242g(Integer.valueOf(w7e.ic_tasks), Integer.valueOf(w7e.ic_add_visit), Integer.valueOf(w7e.ic_call), Integer.valueOf(w7e.ic_add_notes), Integer.valueOf(w7e.ic_contact_owner), Integer.valueOf(w7e.ic_add_call_details));

    /* renamed from: m */
    public static final ArrayList f50819m = ch3.m21242g(Integer.valueOf(u6e.backgroundTasks), Integer.valueOf(u6e.backgroundVisits), Integer.valueOf(u6e.backgroundCalls), Integer.valueOf(u6e.backgroundAssigned), Integer.valueOf(u6e.progressColor1), Integer.valueOf(u6e.progressColor2), Integer.valueOf(u6e.progressColor3));

    /* renamed from: a */
    public static final String m53364a() {
        ArrayList arrayList = f50816j;
        Object obj = arrayList.get(new Random().nextInt(arrayList.size()));
        sq8.m48648g(obj, "get(...)");
        return (String) obj;
    }

    /* renamed from: b */
    public static final int m53365b() {
        ArrayList arrayList = f50819m;
        Object obj = arrayList.get(new Random().nextInt(arrayList.size()));
        sq8.m48648g(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* renamed from: c */
    public static final int m53366c() {
        ArrayList arrayList = f50818l;
        Object obj = arrayList.get(new Random().nextInt(arrayList.size()));
        sq8.m48648g(obj, "get(...)");
        return ((Number) obj).intValue();
    }

    /* renamed from: d */
    public static final ArrayList m53367d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new DistributionData("1", "Sample1"));
        arrayList.add(new DistributionData("2", "Sample2"));
        arrayList.add(new DistributionData("3", "Sample3"));
        arrayList.add(new DistributionData("4", "Sample4"));
        arrayList.add(new DistributionData("5", "Sample5"));
        return arrayList;
    }
}
