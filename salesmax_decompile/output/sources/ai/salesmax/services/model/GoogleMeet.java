package ai.salesmax.services.model;

/* loaded from: classes.dex */
public class GoogleMeet {

    public static class ActiveConference {
        private String conferenceRecord;

        public String getConferenceRecord() {
            return this.conferenceRecord;
        }

        public void setConferenceRecord(String str) {
            this.conferenceRecord = str;
        }
    }

    public static class Error {
        String formatted;
        Integer httpCode;
        String message;
        String raw;
        String statusCode;

        /* renamed from: type, reason: collision with root package name */
        String f58056type;

        public String getFormatted() {
            return this.formatted;
        }

        public Integer getHttpCode() {
            return this.httpCode;
        }

        public String getMessage() {
            return this.message;
        }

        public String getRaw() {
            return this.raw;
        }

        public String getStatusCode() {
            return this.statusCode;
        }

        public String getType() {
            return this.f58056type;
        }

        public void setFormatted(String str) {
            this.formatted = str;
        }

        public void setHttpCode(Integer num) {
            this.httpCode = num;
        }

        public void setMessage(String str) {
            this.message = str;
        }

        public void setRaw(String str) {
            this.raw = str;
        }

        public void setStatusCode(String str) {
            this.statusCode = str;
        }

        public void setType(String str) {
            this.f58056type = str;
        }
    }

    public static class Space {
        private ActiveConference activeConference;
        private SpaceConfig config;
        private String meetingCode;
        private String meetingUri;
        private String name;

        public ActiveConference getActiveConference() {
            return this.activeConference;
        }

        public SpaceConfig getConfig() {
            return this.config;
        }

        public String getMeetingCode() {
            return this.meetingCode;
        }

        public String getMeetingUri() {
            return this.meetingUri;
        }

        public String getName() {
            return this.name;
        }

        public void setActiveConference(ActiveConference activeConference) {
            this.activeConference = activeConference;
        }

        public void setConfig(SpaceConfig spaceConfig) {
            this.config = spaceConfig;
        }

        public void setMeetingCode(String str) {
            this.meetingCode = str;
        }

        public void setMeetingUri(String str) {
            this.meetingUri = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    public static class SpaceConfig {
        private String accessType;
        private String entryPointAccess;

        public String getAccessType() {
            return this.accessType;
        }

        public String getEntryPointAccess() {
            return this.entryPointAccess;
        }

        public void setAccessType(String str) {
            this.accessType = str;
        }

        public void setEntryPointAccess(String str) {
            this.entryPointAccess = str;
        }
    }
}
