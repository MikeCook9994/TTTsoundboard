import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.sound.sampled.*;

import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;

@SuppressWarnings("serial")
public class GUI extends JFrame {
	private JButton sound1, sound2, sound3, sound4, sound5, sound6, sound7, sound8, sound9, sound10, sound11, sound12, sound13, sound14, sound15, sound16,
	sound17, sound18, sound19, sound20, sound21, sound22, sound23, sound24, sound25, sound26, sound27, sound28, sound29, sound30, sound31, sound32, sound33,
	sound34, sound35, sound36, sound37, sound38, sound39, sound40;
	private JPanel moans, answers, questions, pain, otherTTT, nonTTT, bryce, rage, top;
	private JLabel moansL, answersL, questionsL, painL, nonTTTL, otherLTTT, bryceL, rageL;
	private ImageIcon timeIcon;
	private AudioInputStream audioInputStream = null;
	private Clip clip = null;
	private int clickCount = 0;
	
	public GUI() {
		
		//JFrame
		
		//top level container
		top = new JPanel(new GridLayout(8,1));
		
		//GridBagConstraint Object
		GridBagConstraints c = new GridBagConstraints();
		
		//moans sound buttons
		moans = new JPanel(new GridBagLayout());
		moansL = new JLabel("moans");
		c.gridwidth = 5;
		c.weightx = 1.0;
		c.weighty = 1.0;
		c.gridx = 0;
		c.gridy = 0;
		moans.add(moansL, c);
		
		//moan01.wav
		sound1 = new JButton("<html><center>moan01.wav<br />ugh-n-ah</center></html>");
		button1ActionListener B1AL = new button1ActionListener();
		sound1.addActionListener(B1AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		moans.add(sound1, c);
		
		//moan02.wav
		sound2 = new JButton("<html><center>moan02.wav<br />uhg-g-g-ah-sh</center></html>");
		button2ActionListener B2AL = new button2ActionListener();
		sound2.addActionListener(B2AL);
		c.gridx = 1;
		c.gridy = 1;
		moans.add(sound2, c);
		
		//moan03.wav
		sound3 = new JButton("<html><center>moan03.wav<br />uhh-aghgh</center></html>");
		button3ActionListener B3AL = new button3ActionListener();
		sound3.addActionListener(B3AL);
		c.gridx = 2;
		c.gridy = 1;
		moans.add(sound3, c);
		
		//moan04.wav
		sound4 = new JButton("<html><center>moan04.wav<br />ohh</center></html>");
		button4ActionListener B4AL = new button4ActionListener();
		sound4.addActionListener(B4AL);
		c.gridx = 3;
		c.gridy = 1;
		moans.add(sound4, c);
		
		//moan05.wav
		sound5 = new JButton("<html><center>moan05.wav<br />ahh</center></html>");
		button5ActionListener B5AL = new button5ActionListener();
		sound5.addActionListener(B5AL);
		c.gridx = 4;
		c.gridy = 1;
		moans.add(sound5, c);
		
		top.add(moans);
		
		//pain sound buttons
		pain = new JPanel(new GridBagLayout());
		painL = new JLabel("pain");
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 7;
		c.gridx = 0;
		c.gridy = 0;
		pain.add(painL,c);
		
		//no02.wav
		sound6 = new JButton("<html><center>no02.wav<br />AAOOUUGHH</center></html>");
		button6ActionListener B6AL = new button6ActionListener();
		sound6.addActionListener(B6AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		pain.add(sound6,c);
		
		//BA_pain06.wav
		sound7 = new JButton("<html><center>ba_pain06.wav<br />OUGH</center></html>");
		button7ActionListener B7AL = new button7ActionListener();
		sound7.addActionListener(B7AL);
		c.gridx = 1;
		c.gridy = 1;
		pain.add(sound7,c);
		
		//pain06.wav
		sound8 = new JButton("<html><center>pain06.wav<br />GAWH</center></html>");
		button8ActionListener B8AL = new button8ActionListener();
		sound8.addActionListener(B8AL);
		c.gridx = 2;
		c.gridy = 1;
		pain.add(sound8,c);
		
		//pain07.wav
		sound9 = new JButton("<html><center>pain07.wav<br />GYAH</center></html>");
		button9ActionListener B9AL = new button9ActionListener();
		sound9.addActionListener(B9AL);
		c.gridx = 3;
		c.gridy = 1;
		pain.add(sound9,c);
		
		//pain08.wav
		sound10 = new JButton("<html><center>pain08.wav<br />GRGH</center></html>");
		button10ActionListener B10AL = new button10ActionListener();
		sound10.addActionListener(B10AL);
		c.gridx = 4;
		c.gridy = 1;
		pain.add(sound10,c);
		
		//pain09.wav
		sound11 = new JButton("<html><center>pain09.wav<br />EYAH</center></html>");
		button11ActionListener B11AL = new button11ActionListener();
		sound11.addActionListener(B11AL);
		c.gridx = 5;
		c.gridy = 1;
		pain.add(sound11,c);
		
		//ow02.wav
		sound28 = new JButton("<html><center>ow02.wav<br />OWW</center></html>");
		button28ActionListener B28AL = new button28ActionListener();
		sound28.addActionListener(B28AL);
		c.gridx = 6;
		c.gridy = 1;
		pain.add(sound28,c);
		
		top.add(pain);
		
		//questions sound buttons
		questions = new JPanel(new GridBagLayout());
		questionsL = new JLabel("questions");
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 4;
		c.gridx = 0;
		c.gridy = 0;
		questions.add(questionsL, c);
		
		//question04.wav
		sound12 = new JButton("<html><center>question04.wav<br />When this is all over (Beta)</center></html>");
		button12ActionListener B12AL = new button12ActionListener();
		sound12.addActionListener(B12AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		questions.add(sound12,c);
		
		//vquestion04.wav
		sound13 = new JButton("<html><center>vquestion04.wav<br />Ended up with you</center></html>");
		button13ActionListener B13AL = new button13ActionListener();
		sound13.addActionListener(B13AL);
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		questions.add(sound13,c);
		
		//question26.wav
		sound14 = new JButton("<html><center>question26.wav<br />Bullshit</center></html>");
		button14ActionListener B14AL = new button14ActionListener();
		sound14.addActionListener(B14AL);
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		questions.add(sound14,c);
		
		//question29.wav
		sound15 = new JButton("<html><center>question29.wav<br />When this is all over (Alpha)</center></html>");
		button15ActionListener B15AL = new button15ActionListener();
		sound15.addActionListener(B15AL);
		c.gridwidth = 1;
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		questions.add(sound15,c);
		
		top.add(questions);
		
		//answers sound buttons
		answers = new JPanel(new GridBagLayout());
		answersL = new JLabel("answers");
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 5;
		c.gridx = 0;
		c.gridy = 0;
		answers.add(answersL, c);
		
		//answer16 2.wav
		sound16 = new JButton("<html><center>answer16 2.wav<br >original thought</center></html>");
		button16ActionListener B16AL = new button16ActionListener();
		sound16.addActionListener(B16AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		answers.add(sound16,c);
		
		//answer17.wav
		sound17 = new JButton("<html><center>answer17.wav<br />shut up</center></html>");
		button17ActionListener B17AL = new button17ActionListener();
		sound17.addActionListener(B17AL);
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 1;
		answers.add(sound17,c);
		
		//answer35.wav
		sound18 = new JButton("<html><center>answer35.wav<br />virgin fag</center></html>");
		button18ActionListener B18AL = new button18ActionListener();
		sound18.addActionListener(B18AL);
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 1;
		answers.add(sound18,c);
		
		//vanswer05.wav
		sound19 = new JButton("<html><center>vanswer05.wav<br />speak english</center></html>");
		button19ActionListener B19AL = new button19ActionListener();
		sound19.addActionListener(B19AL);
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 1;
		answers.add(sound19,c);
		
		//vanswer07.wav
		sound20 = new JButton("<html><center>vanswer07.wav<br />why we put up with ya</center></html>");
		button20ActionListener B20AL = new button20ActionListener();
		sound20.addActionListener(B20AL);
		c.gridwidth = 1;
		c.gridx = 4;
		c.gridy = 1;
		answers.add(sound20,c);
		
		top.add(answers);
		
		//other sound buttons
		otherTTT = new JPanel(new GridBagLayout());
		otherLTTT = new JLabel("other TTT");
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 5;
		c.gridx = 0;
		c.gridy = 0;
		otherTTT.add(otherLTTT,c);
		
		//ba_ohshit03.wav
		sound21 = new JButton("<html><center>ba_ohshit03.wav<br >oh shit!</center></html>");
		button21ActionListener B21AL = new button21ActionListener();
		sound21.addActionListener(B21AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		otherTTT.add(sound21,c);
		
		//goodgod.wav
		sound22 = new JButton("<html><center>goodgod.wav<br >good god!</center></html>");
		button22ActionListener B22AL = new button22ActionListener();
		sound22.addActionListener(B22AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 1;
		otherTTT.add(sound22,c);
		
		//notthemanithough02.wav
		sound24 = new JButton("<html><center>notthemanithough02.wav<br >not the man I thought (dissapointed)</center></html>");
		button24ActionListener B24AL = new button24ActionListener();
		sound24.addActionListener(B24AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 2;
		c.gridy = 1;
		otherTTT.add(sound24,c);
		
		//notthemanithough01.wav
		sound23 = new JButton("<html><center>notthemanithough01.wav<br >not the man I thought (angry)</center></html>");
		button23ActionListener B23AL = new button23ActionListener();
		sound23.addActionListener(B23AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 3;
		c.gridy = 1;
		otherTTT.add(sound23,c);
		
		//ohno.wav
		sound25 = new JButton("<html><center>ohno.wav<br >oh no!</center></html>");
		button25ActionListener B25AL = new button25ActionListener();
		sound25.addActionListener(B25AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 4;
		c.gridy = 1;
		otherTTT.add(sound25,c);
		
		top.add(otherTTT);
	
		//Rage Label
		rage = new JPanel(new GridBagLayout());
		rageL = new JLabel("RAGE!");
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 5;
		c.gridx = 0;
		c.gridy = 0;
		rage.add(rageL,c);
		
		//my HD gift to zach.wav
		sound26 = new JButton("<html><center>my HD gift to zach.wav<br />TALKING!</center></html>");
		button26ActionListener B26AL = new button26ActionListener();
		sound26.addActionListener(B26AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		rage.add(sound26, c);
		
		//what the fuck.mp3
		sound27 = new JButton("<html><center>what the fuck.wav<br />??????</center></html>");
		button27ActionListener B27AL = new button27ActionListener();
		sound27.addActionListener(B27AL);
		c.gridx = 1;
		c.gridy = 1;
		rage.add(sound27, c);
		
		//Definition of Outright Furocity.wav
		sound31 = new JButton("<html><center>Definition of Outright Furocity.wav<br />*unleashing*</center></html>");
		button31ActionListener B31AL = new button31ActionListener();
		sound31.addActionListener(B31AL);
		c.gridx = 2;
		c.gridy = 1;
		rage.add(sound31, c);
		
		//definition of ragequit in all of recent years.wav
		sound32 = new JButton("<html><center>definition of ragequit in all of recent years.wav<br />*breathing* *death cry* *laughing* *shit breaking*</center></html>");
		button32ActionListener B32AL = new button32ActionListener();
		sound32.addActionListener(B32AL);
		c.gridx = 3;
		c.gridy = 1;
		rage.add(sound32, c);
		
		//ragequit.wav
		sound33 = new JButton("<html><center>ragequit.wav<br />r-r-r-r-ragequit!</center></html>");
		button33ActionListener B33AL = new button33ActionListener();
		sound33.addActionListener(B33AL);
		c.gridx = 4;
		c.gridy = 1;
		rage.add(sound33, c);
		
		top.add(rage);
		
		//Other NonTTT Sounds
		nonTTT = new JPanel(new GridBagLayout());
		nonTTTL = new JLabel("other Non TTT");
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 2;
		c.gridx = 0;
		c.gridy = 0;
		nonTTT.add(nonTTTL,c);
		
		//uhh. no-.wav
		sound29 = new JButton("<html><center>uhhhh. no-.wav<br />Uhhhh. No.</center></html>");
		button29ActionListener B29AL = new button29ActionListener();
		sound29.addActionListener(B29AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.ipady = 8;
		c.gridx = 0;
		c.gridy = 1;
		nonTTT.add(sound29, c);
		
		//time.wav
		timeIcon = new ImageIcon(getClass().getResource("otherNonTTT/time_20.png"));
		sound30 = new JButton();
		sound30.setText("time.wav");
		sound30.setIcon(timeIcon);
		sound30.setHorizontalTextPosition(AbstractButton.CENTER);
		sound30.setVerticalTextPosition(AbstractButton.TOP);
		button30ActionListener B30AL = new button30ActionListener();
		sound30.addActionListener(B30AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 0;
		c.gridwidth = 1;
		c.gridx = 1;
		c.gridy = 1;
		nonTTT.add(sound30, c);
		
		top.add(nonTTT);
		
		//Bryce sound bites
		bryce = new JPanel(new GridBagLayout());
		bryceL = new JLabel("Bryce");
		c.fill = GridBagConstraints.NONE;
		c.gridwidth = 7;
		c.gridx = 0;
		c.gridy = 0;
		bryce.add(bryceL, c);
		
		//1 bryce hello.wav
		sound34 = new JButton("<html><center>1 bryce hello.wav<br />Hello?</center></html>");
		button34ActionListener B34AL = new button34ActionListener();
		sound34.addActionListener(B34AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridwidth = 1;
		c.gridx = 0;
		c.gridy = 1;
		bryce.add(sound34, c);
		
		//bryce - ahhh crap.wav
		sound35 = new JButton("<html><center>bryce - ahhh crap.wav<br />Oh crap!</center></html>");
		button35ActionListener B35AL = new button35ActionListener();
		sound35.addActionListener(B35AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		bryce.add(sound35, c);
		
		//bryce - alriiiiight.wav
		sound36 = new JButton("<html><center>bryce - alriiiiight.wav<br />ALRIGHT!</center></html>");
		button36ActionListener B36AL = new button36ActionListener();
		sound36.addActionListener(B36AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		bryce.add(sound36, c);
		
		//bryce - are you freakin kidding me.wav
		sound37 = new JButton("<html><center>bryce - are you freakin kidding me.wav<br />Are you freakin' kidding me?!</center></html>");
		button37ActionListener B37AL = new button37ActionListener();
		sound37.addActionListener(B37AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		bryce.add(sound37, c);
		
		//bryce - cause im stupid.wav
		sound38 = new JButton("<html><center>bryce - cause im stupid.wav<br />Cause I'm STU-PID!</center></html>");
		button38ActionListener B38AL = new button38ActionListener();
		sound38.addActionListener(B38AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 1;
		bryce.add(sound38, c);
		
		//bryce - i should just kill myself.wav
		sound39 = new JButton("<html><center>bryce - i should just kill myself.wav<br />I should just kill myself!</center></html>");
		button39ActionListener B39AL = new button39ActionListener();
		sound39.addActionListener(B39AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 5;
		c.gridy = 1;
		bryce.add(sound39, c);
		
		//bryce - whyyyyyyy.wav
		sound40 = new JButton("<html><center>bryce - whyyyyyyy.wav<br />Nooo...Wwhhyy?</center></html>");
		button40ActionListener B40AL = new button40ActionListener();
		sound40.addActionListener(B40AL);
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 6;
		c.gridy = 1;
		bryce.add(sound40, c);
		
		top.add(bryce);
		
		add(top);
	}
	
	//method called by the action listeners that plays the sound bites
	//playsound method called by the action listeners
	public void playSound(String soundName)
	{	
		if(clickCount != 0) 
		{
			clip.stop();	
		}
		try 
		{
			audioInputStream = AudioSystem.getAudioInputStream(getClass().getResource(soundName));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
		} catch(IOException e) {
			System.out.println("Error playing sound clip");
		} catch (LineUnavailableException e) {
			System.out.println("Error playing sound clip");
		} catch (UnsupportedAudioFileException e) {
			System.out.println("Error playing sound clip");
		}
		clip.start();
		clickCount++;
	}
	
	//A cluster of action listeners
	
	public class button1ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("moans/moan01.wav");		
		}
	}
	
	public class button2ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("moans/moan02.wav");	
		}
	}
	
	public class button3ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("moans/moan03.wav");	
		}
	}
	
	public class button4ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("moans/moan04.wav");	
		}
	}
	
	public class button5ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("moans/moan05.wav");	
		}
	}
	
	public class button6ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("pain/no02.wav");	
		}
	}
	
	public class button7ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("pain/ba_pain06.wav");	
		}
	}
	
	public class button8ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("pain/pain06.wav");	
		}
	}
	
	public class button9ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("pain/pain07.wav");	
		}
	}
	
	public class button10ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("pain/pain08.wav");	
		}
	}
	
	public class button11ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("pain/pain09.wav");	
		}
	}
	
	public class button12ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("questions/question04.wav");	
		}
	}
	
	public class button13ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("questions/vquestion04.wav");	
		}
	}	
	public class button14ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("questions/question26.wav");	
		}
	}
	public class button15ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("questions/question29.wav");	
		}
	}	
	public class button16ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("answers/answer16 2.wav");	
		}
	}	
	public class button17ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("answers/answer17.wav");	
		}
	}	
	public class button18ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("answers/answer35.wav");	
		}
	}	
	public class button19ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("answers/vanswer05.wav");	
		}
	}	
	public class button20ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("answers/vanswer07.wav");	
		}
	}
	public class button21ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("otherTTT/ba_ohshit03.wav");	
		}
	}
	public class button22ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("otherTTT/goodgod.wav");	
		}
	}
	public class button23ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("otherTTT/notthemanithought01.wav");	
		}
	}
	public class button24ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("otherTTT/notthemanithought02.wav");	
		}
	}
	public class button25ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("otherTTT/ohno.wav");	
		}
	}	
	public class button26ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("Rage/my HD gift to zach.wav");	
		}
	}	
	public class button27ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("Rage/what the fuck.wav");	
		}
	}
	public class button28ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("pain/ow02.wav");	
		}
	}
	public class button29ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("otherNonTTT/uhhhh. no-.wav");	
		}
	}
	public class button30ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("otherNonTTT/time.wav");	
		}
	}
	public class button31ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("Rage/Definition of Outright Furocity.wav");	
		}
	}
	public class button32ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("Rage/definition of ragequit in all of recent years.wav");	
		}
	}
	public class button33ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("Rage/ragequit.wav");	
		}
	}
	public class button34ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("bryce/1 bryce hello.wav");	
		}
	}
	public class button35ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("bryce/bryce - ahhh crap.wav");	
		}
	}
	public class button36ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("bryce/bryce - alriiiiight.wav");	
		}
	}
	public class button37ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("bryce/bryce - are you freakin kidding me.wav");	
		}
	}
	public class button38ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("bryce/bryce - cause im stupid.wav");	
		}
	}
	public class button39ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("bryce/bryce - i should just kill myself.wav");	
		}
	}
	public class button40ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			playSound("bryce/bryce - whyyyyyyy.wav");	
		}
	}
}
