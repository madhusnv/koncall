package com.apollographql.apollo.api;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Error {
    private final Map<String, Object> customAttributes;
    private final List<Location> locations;
    private final String message;

    public static class Location {
        private final long column;
        private final long line;

        public Location(long j, long j2) {
            this.line = j;
            this.column = j2;
        }

        public long column() {
            return this.column;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Location location = (Location) obj;
            return this.line == location.line && this.column == location.column;
        }

        public int hashCode() {
            long j = this.line;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.column;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public long line() {
            return this.line;
        }

        public String toString() {
            return "Location{line=" + this.line + ", column=" + this.column + '}';
        }
    }

    public Error(String str, List<Location> list, Map<String, Object> map) {
        this.message = str;
        this.locations = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        this.customAttributes = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
    }

    public Map<String, Object> customAttributes() {
        return this.customAttributes;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        String str = this.message;
        if (str == null ? error.message != null : !str.equals(error.message)) {
            return false;
        }
        if (this.locations.equals(error.locations)) {
            return this.customAttributes.equals(error.customAttributes);
        }
        return false;
    }

    public int hashCode() {
        String str = this.message;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.locations.hashCode()) * 31) + this.customAttributes.hashCode();
    }

    public List<Location> locations() {
        return this.locations;
    }

    public String message() {
        return this.message;
    }

    public String toString() {
        return "Error{message='" + this.message + "', locations=" + this.locations + ", customAttributes=" + this.customAttributes + '}';
    }
}
