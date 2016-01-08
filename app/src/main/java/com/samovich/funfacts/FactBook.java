package com.samovich.funfacts;

import java.util.Random;

public class FactBook {

    // Fields (Member Variables) - Properties about the object
    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "The Solar System formed around 4.6 billion years ago.",
            "Giant Arctic jellyfish have tentacles that can reach over 36 metres in length.",
            "Unlike humans, sheep have four stomachs, each one helps them digest the food they eat.",
            "The Sun is over 300000 times larger than earth.",
            "Around 2000 different types of plants are used by humans to make food.",
            "A pineapple is a berry.",
            "Nerve impulses to and from the brain travel as fast as 170 miles per hour.",
            "The human brain cell can hold 5 times as much information as the Encyclopedia Britannica.",
            "The first man made object sent into space was in 1957 when the Russian satellite named Sputnik was launched.",
            "Instead of bones, sharks have a skeleton made from cartilage.",
            "80% of the brain is water.",
            "The human heart creates enough pressure to squirt blood 30 feet.",
            "The brain operates on the same amount of power as 10-watt light bulb.",
            "Tigers are good swimmers and can swim up to 6 kilometres.",
            "Tigers have been known to reach speeds up to 65 kph (40 mph).",
            "The 1980’s saw the arrival of remote controls.",
            "Scientists have the dated the Earth as being between 4 and 5 billion years old!",
            "Sound can’t travel through a vacuum (an area empty of matter).",
            "The scientific study of sound waves is known as acoustics.",
            "Sneezing with your eyes open is impossible.",
            "Birds descended from a type of dinosaurs known as theropods.",
            "Unmanned aircraft controlled remotely or by computers are known as drones.",
            "The fastest speed recorded by a helicopter is around 400 kph (248 mph).",
            "Helicopters are sometimes called choppers.",
            "Large watercraft are generally called ships.",
            "Smaller watercraft are generally called boats.",
            "The average apple contains around 130 calories.",
            "Your nose and ears continue growing throughout your entire life.",
            "Water covers around 70% of the Earth’s surface.",
            "Water has three different states, liquid, solid and gas.",
            "Electric eels can produce strong electric shocks of around 500 volts.",
            "Fires require fuel, oxygen and heat to burn.",
            "Fires is an important ecological process that can stimulate growth.",
            "Olympic gold medals are actually made mostly of silver.",
            "The fastest recorded tennis serves are over 155 mph (250 kph).",
            "Viruses can be treated with antiviral drugs.",
            "Bacterial infections can be treated with antibiotics.",
            "The Mona Lisa has no eye brows.",
            "Ketchup used to be as thick as medicine.",
            "Babies yawn before they are born.",
            "More than 480 million people have played Monopoly.",
            "Your heart is about the same size as your fist.",
            "Dust from Africa can travel all the way to Florida",
            "The longest recorded flight of a chicken is thirteen seconds.",
            "If you fell into a black hole, you'd stretch out like spaghetti.",
            "There are about a quadrillion ants on Earth.",
            "A large python can swallow a goat whole.",
            "At least 12 rocks from Mars have landed on Earth.",
            "Crocodiles often eat rocks.",
            "Pigs can get sunburned.",
            "The world's lightest mammal-the bumblebee bat- weighs less than a nickel.",
            "A tiger's skin is striped like it's fur.",
            "Giant tortoises keep growing their whole lives.",
            "Frogs drink through their skin.",
            "Pet hamsters can run up to eight miles a night on a wheel.",
            "A cat has about 20 muscles in each ear.",
            "Every day is about 55 billionths of a second longer than the day before it.",
            "When you see lightning, it is traveling at about 227 million mph.",
            "Horseshoe crabs lived before dinosaurs.",
            "About 6,000,000 pounds of space dust settle on earth every year.",
            "Monkeys can go bald in old age, just like humans can.",
            "Dragonflies can see in all directions at once.",
            "The world's heaviest onion weighed more that the head of a man.",
            "Only male toads croak.",
            "You can tell lions apart by the spots at the base of their whiskers.",
            "Opposite sides of dice always add up to seven.",
            "An average yawn lasts about six seconds.",
            "The Empire State building was built with ten million bricks.",
            "Eating shrimp can turn white flamingos pink.",
            "Sharks have eight senses when us humans only have five.",
            "Your brain is about three quarters water.",
            "The Bahamas once had an undersea post office.",
            "There are more stars in the universe than grains of sand on the earth.",
            "A dairy cow produces about 100,000 glasses of milk in it's lifetime.",
            "Yo-yos rode on two spaceships.",
            "The oldest human footprint ever found is 350,000 years old.",
            "Blonde's have more hair than brunettes.",
            "An oyster can take five years just to make one pearl.",
            "A newborn blue whale can be longer than an adult elephant.",
            "In the summer, the amount of water pouring over Niagara Falls each second could fill 13,00 bathtubs.",
            "It's illegal to sell a haunted house in New York without telling the buyer.",
            "Owls can't move their eyeballs.",
            "Your skeleton has about 300 bones when you are born, but only 206 when you grow up.",
            "An elephant’s skin is an inch thick.",
            "Elephants have poor eyesight but an amazing sense of smell.",
            "August has the highest percentage of births.",
            "Unless food is mixed with saliva you can't taste it.",
            "The average person falls asleep in 7 minutes.",
            "A bear has 42 teeth.",
            "An ostrich's eye is bigger than its brain.",
            "The Arctic Ocean is the smallest in the world.",
            "The most common mental illnesses are anxiety and depression.",
            "The word laser stands for 'Light Amplification by Stimulated Emission of Radiation'.",
            "Crocodiles never outgrow their enclosure.",
            "Reindeer hair is hollow inside like a tube.",
            "Skin is the largest organ making up the human body.",
            "The Eiffel Tower has 1,792 steps.",
            "Isaac Newton invented the cat door.",
            "The Titanic was built in Belfast."
    };

    // Methods - Actions the object can take
    public String getFact() {

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}
