package com.codeoregonapp.patrickleonard.inthekitchenat2am.model;

import com.codeoregonapp.patrickleonard.inthekitchenat2am.R;

/**
 * Created by Patrick Leonard on 10/18/2015.
 */
public class Story {
    private Page[] mPages;

    public Story() {
        mPages = new Page[25];

        mPages[0] = new Page(
                R.drawable.page0,
                "\"%s\"...  You're sleeping soundly in your bed, when you're awakened by the sound of your name.  Suddenly there’s a commotion downstairs!",
                new Choice("Check it out", 1),
                new Choice("Hide and call 911", 2));

        mPages[1] = new Page(
                R.drawable.page1,
                "You sneak downstairs to find a light on in the kitchen. You can hear the sound of two voices having a hushed conversation.",
                new Choice("Investigate further!", 4),
                new Choice("I'm out! Climb out the upstairs window.", 3));

        mPages[2] = new Page(
                R.drawable.page2,
                "You reach for your phone, but the battery is dead. Now what?",
                new Choice("Climb out the window", 3),
                new Choice("Sneak downstairs", 1));

        mPages[3] = new Page(
                R.drawable.page3,
                "You're not sure what's going on in your house, and you don't care to find out! You climb out the upstairs window and thud to the ground in the yard. You're trying to decide what to do next when something shambles up out of the shadows! \"%s! It's you! It's really you! Listen, my name is Jim, and I'm from the future! I've been sent here to make sure that you make the right decision. You need to go back inside to your kitchen or we're all doomed!\"",
                new Choice("Drugs are bad, man.",23),
                new Choice("Okay! Your enthusiasm is contagious!", 4));

        mPages[4] = new Page(
                R.drawable.page4,
                "You sneak up to the kitchen and peer around the corner to find a bizarre sight. A cat in a rainbow scarf stands on the table across from what looks to be a strawberry flan.",
                new Choice("You must be dreaming. Pinch yourself.", 24),
                new Choice("Clear your throat", 18));

        mPages[5] = new Page(
                R.drawable.page5,
                "How did it come to this? You're no match for the giant flan. The human race is no match for the giant flan. Even the mysterious cat is no match for the giant flan. The planet is conquered! And it's all because of your choices in the kitchen at 2 AM.");

        mPages[6] = new Page(
                R.drawable.page6,
                "You bolt from the kitchen, heading for the front door. The sound of claws on linoleum follows. \"Wait!\" comes a tiny voice from behind you.",
                new Choice("Oh hell no!",21),
                new Choice("Stop and turn around",7));


        mPages[7] = new Page(
                R.drawable.page7,
                "The cuteness of the voice is too much to resist. You stop and turn to meet the eyes of an adorable cat.\n" +
                        "\"I'm sorry for scaring you, %s. It is imperative that you hear me out. Please, come to the kitchen where we may talk.\"",
                new Choice("What could possibly go wrong? Follow the cat.",8),
                new Choice("This is a bad idea, run!",21));

        mPages[8] = new Page(
                R.drawable.page8,
                "The cat seems trustworthy enough, as far as cats in rainbow scarfs go. You enter the kitchen, where it gestures to the flan. \"Please, %s, sit. Have some flan. I have brought it as a gesture of goodwill.\"",
                new Choice("This can't get any more weird. Eat the flan",9),
                new Choice("I'm not a fan of flan. No thanks.",16));

        mPages[9] = new Page(
                R.drawable.page9,
                "If there was ever a time for flan, it's when a rainbow scarf clad cat offers it to you at 2 AM. You turn away from the cat and the flan and grab a fork. \"%s, Stop!\" gasps a voice. \"Wait! Don't turn around!\"",
                new Choice("Turn around.",10),
                new Choice("Don't turn around.",11));

        mPages[10] = new Page(
                R.drawable.page10,
                "You whirl around, startled. \"What?\"\n" +
                        "The cat regards you curiously. \"Hmm? Are you going to eat this flan or what?\"\n" +
                        "You look back and forth between the cat and the flan.",
                new Choice("There's no way that was the flan talking. Dig in.",12),
                new Choice("Something's fishy here.",16));

        mPages[11] = new Page(
                R.drawable.page11,
                "You freeze, and the voice continues.  \"%s, don’t eat me!  This cat is a trickster!  He’s here to conquer your planet!\"",
                new Choice("Whaaa?!",10),
                new Choice("Okay, it’s way past time to run! RUN!",16));

        mPages[12] = new Page(
                R.drawable.page12,
                "You take a seat at the table and dig in to the flan while the cat starts telling you a crazy story about space travel and the future of its planet or something. You're not really listening, though, because your ears are ringing, and the room is getting dark....\n" +
                        "\n" +
                        "You wake to find yourself surrounded by flan of various shapes, sizes, and colors. \"LOOK AWAY!\" cries a chorus of tiny voices. \"Your gaze paralyzes our kind!\"",
                new Choice("No thank you, I've had enough crazy for tonight.",13),
                new Choice("I'm outnumbered...better obey the flan.",20));

        mPages[13] = new Page(
                R.drawable.page13,
                "You draw the line at talking cats! You plow forward through the flan wall, kicking left and right and scattering desserts to all corners of the living room. \"Please, %s! We're trying to help you!\" cries a flan from behind you. \"That's what the cat said, and now my kitchen is full of talking desserts!\" you retort. And where did that cat go, anyway?",
                new Choice("Check outside",14),
                new Choice("Check the house",15));

        mPages[14] = new Page(
                R.drawable.page14,
                "You make a beeline for the front door. In your haste to find the talking cat, you fail to notice the flan amassing behind you! A big voice booms out: \"%s, we tried to help you, even after you ate our brother...\" You turn to find a giant flan looming above you, and this time your gaze does nothing to stop it! \"Clearly you are much too narrow minded of a species to accept our wisdom. We will take this planet for our own and deal with the problem ourselves!\" The giant flan slithers closer to you....",
                new Choice("Accept your fate...",5),
                new Choice("Never give up!!  RUN!!!",5));

        mPages[15] = new Page(
                R.drawable.page15,
                "You run for the living room with the flan close behind. How do they move so fast? You turn to paralyze them, backing into the living room, but they're behind you too! Before you know it you're surrounded. Suddenly the cat appears! \"Get down!\" You duck as the cat unleashes a blinding rainbow light upon the room. The flan disintegrate." + "\n" + "\"Phew. I'm sorry, I had no idea eating the flan would incapacitate you. I thought it was an easy way to dispatch them. Will you hear me out?\"",
                new Choice("No way. You poisoned me with sentient flan! Run!",16),
                new Choice("Oh sure, why not.",17));

        mPages[16] = new Page(
                R.drawable.page16,
                "You're not trusting this cat! You run for the front door, but the cat beats you to it! The cat sighs. \"I had hoped our kinds could work together. But you humans are so primitive. My people will have to find another way to wipe out the flan. As for you...\"",
                new Choice("Wait, wait! I'll help!",19),
                new Choice("Pssh. What's the worst this cat can do?",22));

        mPages[17] = new Page(
                R.drawable.page17,
                "\"I have journeyed here to save you. The flan have destroyed my planet, and now they have come for yours. The flan and my people are mortal enemies, but we have no natural defense against them as you do. The weapon I just used is our only hope, and it must recharge for one of your Earth days. Alone, it appears we stand no chance. Together, we must make sure the entire invading force is destroyed!\"",
                new Choice("No. I don't trust you!",22),
                new Choice("Okay! Let's save the planet.",19));

        mPages[18] = new Page(
                R.drawable.page18,
                "\"Listen buddy, I don't--\"  The cat suddenly and slowly looks up at you.  \"Oh, uh, hi!  Didn’t see you there!  Why don’t you come in and have a chat with me?\"",
                new Choice("Talking cat.  Run!",6),
                new Choice("Well, since it asked so nicely...",8));

        mPages[19] = new Page(
                R.drawable.page19,
                "It's a strange alliance, but somehow it works. You and the cat take to the streets, hunting the flan in secret. It's more than a year before you're certain the flan invasion has been quashed, but your cat ally promises to stay in touch. It gives a final salute before you part ways the same as you met: in the kitchen at 2 AM.");

        mPages[20] = new Page(
                R.drawable.page20,
                "You obey the flan and stare at the ceiling.  A squishy, squelchy, gooey kind of sound builds behind you, and you feel...a presence.",
                new Choice("Turn around",5),
                new Choice("I can’t look!",5));

        mPages[21] = new Page(
                R.drawable.page21,
                "Before you can get very far, the cat explains in a rush: \"Stop!  I have journeyed here to save you! The flan have destroyed my planet, and now they have come for yours.  We must work together to stop them!\"",
                new Choice("No! I don't trust you!",22),
                new Choice("Ok! Let's save the planet!",19));

        mPages[22] = new Page(
                R.drawable.page22,
                "\"A pity we could not work together,\" laments the cat before it pounces.  You clearly underestimated it. Sleeper agent cats awaken across the world, and it's mere days before the flan invasion is ended and the entire human race is enslaved. If only you'd made better decisions...in the kitchen at 2 AM.");

        mPages[23] = new Page(
                R.drawable.page23,
                "It's far too early in the morning and you're far too preoccupied to deal with a crazy panhandler. You push past the guy and head for the police station. When the police come back to your house, the hobo is gone. All you find out of the ordinary is a rainbow scarf on the kitchen table. You'll never know what was going on...in the kitchen at 2 AM.");

        mPages[24] = new Page(
                R.drawable.page24,
                "Ow!  You snap awake in your bed, feeling strangely empty and cheated.  It’s as if you missed out on something important...in the kitchen at 2 AM.");

    }

    public Page getPage(int pageNumber) {
        return this.mPages[pageNumber];
    }
}
