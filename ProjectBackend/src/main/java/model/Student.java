package model;

import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @SerializedName("fullName")
    @XmlElement(name = "fullName")
    private String fullName;
    @SerializedName("universityId")
    @XmlElement(name = "universityId")
    private String universityId;

    @SerializedName("faculty")
    @XmlTransient
    private String faculty;
    @XmlTransient
    @SerializedName("currentCourseNumber")
    private int currentCourseNumber;
    @SerializedName("avgExaScore")
    @XmlElement(name = "avgExaScore")
    private float avgExamScore;
        public Student() {
        }
        public String getFullName() {
            return fullName;
        }

        public Student setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getfaculty() {
            return faculty;
        }
    public String getUniversityId() {
        return universityId;
    }
    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }
        public Student setfaculty(String faculty) {
            this.faculty = faculty;
            return this;
        }
        public int getCurrentCourseNumber() {
            return currentCourseNumber;
        }
        public Student setCurrentCourseNumber(int currentCourseNumber) {
            this.currentCourseNumber = currentCourseNumber;
            return this;
        }
        public float getAvgExamScore() {
            return avgExamScore;
        }
        public Student setAvgExamScore(float avgExamScore) {
            this.avgExamScore = avgExamScore;
            return this;
        }
        @Override
        public String toString() {
            return String.format("fullName = %s, faculty = %s, currentCourseNumber = %s, avgExamScore = %s",
                    this.universityId,
                    this.fullName,
                    this.faculty,
                    this.currentCourseNumber,
                    this.avgExamScore);
        }
    }

