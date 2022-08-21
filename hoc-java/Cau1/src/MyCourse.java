import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.sound.sampled.SourceDataLine;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class MyCourse implements ICourse { 

    
    @Override
    public void f1(List<Course> a, int st) {
        if(st==1){
        Collections.sort(a, new Comparator<Course>() {
            @Override 
            public int compare(Course a1, Course a2) {
                return a2.getFee() > a1.getFee()? 1: -1;
                
            }
        });

    } else if(st==0) {
        Collections.sort(a, new Comparator<Course>() {
     
            public int compare(Course a1, Course a2){
                return a1.getName().compareTo(a2.getName());
            }
        });
    }
    
}

    @Override
    public int f2(List<Course> a, double fee) {
        int temp = 0;
        for (Course course: a){
            if(course.getFee() >= fee){
                temp++;
            }
        }
        return temp;
    }
     
}