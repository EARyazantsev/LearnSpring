package com.sas.rusreg.spring;

import com.sun.org.apache.bcel.internal.util.ClassPath;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
/***
 * first lesson
 */
//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());
//        context.close();

/***
 * second lesson
 */
//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.playMusic();
//        context.close();

/***
 * third lesson
 */
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        context.close();

/***
 * fourth lesson
 */
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        musicPlayer.playMusicList();
        context.close();
    }
}
