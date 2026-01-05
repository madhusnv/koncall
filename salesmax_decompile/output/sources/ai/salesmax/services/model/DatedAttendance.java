package ai.salesmax.services.model;

import ai.salesmax.services.model.DatedAttendance;
import com.amplifyframework.core.model.temporal.Temporal;
import com.amplifyframework.datastore.generated.model.Attendance;
import com.amplifyframework.datastore.generated.model.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import p001o.a81;

/* loaded from: classes.dex */
public class DatedAttendance {
    private final Temporal.DateTime attendanceDate;
    private final Map<String, Attendance> attendanceMap;

    public DatedAttendance(Temporal.DateTime dateTime, List<Attendance> list) {
        this.attendanceDate = dateTime;
        this.attendanceMap = toAttendanceMap(list);
    }

    public static DatedAttendance empty(Temporal.DateTime dateTime) {
        return new DatedAttendance(dateTime, Collections.emptyList());
    }

    public static Attendance emptyAttendance(String str, String str2, Date date) {
        return emptyAttendance(str, str2, a81.m16658m(Long.valueOf(date.getTime())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$of$1(DatedAttendance datedAttendance, String str, User user) {
        datedAttendance.addUser(str, user.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$toAttendanceMap$0(Map map, Attendance attendance) {
        map.put(attendance.getUserId(), attendance);
    }

    public static DatedAttendance of(Temporal.DateTime dateTime, List<Attendance> list) {
        return new DatedAttendance(dateTime, list);
    }

    private Map<String, Attendance> toAttendanceMap(List<Attendance> list) {
        final HashMap map = new HashMap();
        list.forEach(new Consumer() { // from class: o.zz4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DatedAttendance.lambda$toAttendanceMap$0(map, (Attendance) obj);
            }
        });
        return map;
    }

    public void addAttendance(Attendance attendance) {
        this.attendanceMap.put(attendance.getUserId(), attendance);
    }

    public void addUser(String str, String str2) {
        if (this.attendanceMap.containsKey(str2)) {
            return;
        }
        this.attendanceMap.put(str2, emptyAttendance(str, str2, this.attendanceDate));
    }

    public Map<String, Attendance> getAllAttendance() {
        return this.attendanceMap;
    }

    public static DatedAttendance empty(Date date) {
        return new DatedAttendance(a81.m16658m(Long.valueOf(date.getTime())), Collections.emptyList());
    }

    public static Attendance emptyAttendance(String str, String str2, Temporal.DateTime dateTime) {
        return Attendance.builder().accountId(str).userId(str2).id("").dateOfAttendance(dateTime).reasonForNonAttendance("Not logged in").build();
    }

    public static DatedAttendance of(Temporal.DateTime dateTime, final String str, List<User> list) {
        final DatedAttendance datedAttendanceEmpty = empty(dateTime);
        list.forEach(new Consumer() { // from class: o.yz4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                DatedAttendance.lambda$of$1(this.f56317a, str, (User) obj);
            }
        });
        return datedAttendanceEmpty;
    }
}
