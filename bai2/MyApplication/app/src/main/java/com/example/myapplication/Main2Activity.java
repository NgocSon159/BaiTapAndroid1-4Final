package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = this.getIntent();
        String textnhan=intent.getStringExtra("monan");
        if(textnhan.equals("Three Cup Chicken with Garlic Spinach"))
        {
            mon1();
        }
        if(textnhan.equals("Chicken Suqaar"))
        {
            mon2();
        }
        if(textnhan.equals("Chicken Enchiladas"))
        {
            mon3();
        }
        if(textnhan.equals("Green Enchiladas with Chicken"))
        {
            mon4();
        }
        if(textnhan.equals("Enchiladas Colorado"))
        {
            mon5();
        }
        if(textnhan.equals("Olga Gonzalez's Enchiladas with Red Sauce"))
        {
            mon6();
        }
        if(textnhan.equals("Spicy Mexican Hot Chocolate Cookies"))
        {
            mon7();
        }
        if(textnhan.equals("Delmonico Chicken Clemenceau"))
        {
            mon8();
        }
        if(textnhan.equals("Spaghetti and Turkey Meatballs"))
        {
            mon9();
        }


        Log.d("adsasd",textnhan);
    }

    public void mon1()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Three Cup Chicken with Garlic Spinach \n \n Ingredients: \n" +
                "3/4 cups jasmine rice \n"+ "1 tablespoon peanut oil \n " + "5 cloves garlic, finely chopped \n"
                +"1/4 cup light soy \n" + "1 tablespoon brown sugar \n" + "1 tablespoon peanut oil \n " + "2 cloves garlic, finely chopped \n "
                +"Two 6-ounce bags baby spinach leaves \n"+ "1/4 cup Shaohsing rice wine or dry sherry \n"
                + "Directions: \n" +
                "For the rice: Rinse the jasmine rice until the water runs clear, to remove excess starch. Place the rinsed rice in a heavy-bottomed saucepan and add 2 1/2 cups water. Bring to a boil, cover tightly with a lid and reduce the heat to low. Cook for 15 to 20 minutes. Remove from the heat, keep covered and set aside until ready to serve.\n" +
                "\n" +
                "For the chicken: Meanwhile, heat a wok over high heat and add the peanut oil. When it begins to smoke, add the garlic and ginger and stir-fry quickly for a few seconds. Then add the chicken and let it settle in the pan for 30 seconds before stir-frying for 2 to 3 minutes until it browns. \n" +
                "\n" +
                "Add the soy sauce, rice wine and toasted sesame oil; reduce the heat to medium and cook for 6 minutes. Stir well and add the brown sugar. Bring to a boil, then turn down the heat to medium-low and simmer until the sauce is reduced to a thick, sticky consistency and the chicken is cooked through, about 5 minutes. Turn off the heat, stir in the basil leaves and allow them to wilt slightly. \n" +
                "\n" +
                "For the spinach: In a separate pan or another wok, heat the peanut oil over medium-high heat. Add the garlic and saute until fragrant. Add the spinach leaves and toss with tongs, or chopsticks until wilted (adding a splash of water to facilitate cooking if desired), 2 to 3 minutes. \n" +
                "\n" +
                "When ready to serve, uncover the pan of steamed rice. Using a fork, fluff up the rice and divide among 4 plates. Serve with a generous portion of the chicken, garnish with chile rings and more basil leaves, if desired. Serve the spinach on the side."
                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.threecupchickenwithgarlicspinach);
    }
    public void mon2()
    {
        TextView txt=findViewById(R.id.congthuc);
        String congthucstr="Chicken Suqaar \n \n"+"Ingredients: \n"+
                "2 chicken breasts, sliced horizontally into thirds\n" +
                "1 teaspoon Cajun seasoning\n" +
                "1 teaspoon paprika\n" +
                "1 teaspoon lemon pepper\n" +
                "1 cup sauteed chopped mixed vegetables, such as corn, carrots, onions, peas and green beans\n" +
                "1 bunch fresh cilantro, stems on\n" +
                "3 tablespoons chicken bouillon\n" +
                "2 teaspoons ground cumin \n"+
                "Kosher salt\n" +
                "Orange food coloring, optional \n"+
                "Directions \n"+
                "For the chicken: Put the chicken breasts in a large bowl and sprinkle with the Cajun seasoning, paprika and lemon pepper. Drizzle with the oil and toss to coat. Cover and let marinate in the refrigerator for 3 hours.\n" +
                "\n" +
                "For the rice: Preheat the oven to 350 degrees F. Saute the onions in the oil in a large ovenproof pan over medium heat, stirring occasionally. Puree the cold water, garlic and cilantro in a blender or food processor. Add the mixture to the onions along with the bouillon, cumin and cardamom and stir in the hot water and rice. Season with salt. If desired, add the orange food coloring for decorative color. Cover and transfer to the oven and cook until the rice is fully cooked and the liquid has been absorbed, 10 to 15 minutes.\n" +
                "\n" +
                "For cooking the chicken: Sear the chicken on a double-burner griddle or in batches in a large skillet over medium-high heat until nearly cooked through. Slice the chicken and then return to the griddle with the sauteed mixed vegetables and bisbess and continue cooking until browned.\n" +
                "\n" +
                "Fill a serving platter with half rice and half spaghetti. Top the rice with the chicken and serve with bananas, limes and bisbess. To eat the pasta, use your right hand to wrap spaghetti around a small chunk of banana."
                ;

        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.chickensugar);
    }
    public void mon3()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Chicken Enchiladas \n \n Ingredients: \n" +
                "3 tablespoons butter\n" +
                "1/3 cup broken spaghetti or orzo\n" +
                "2 cloves garlic, peeled\n" +
                "1 small to medium onion, peeled\n" +
                "1 ripe tomato\n" +
                "1 cup long-grain rice\n" +
                "Enchilada Sauce:\n" +
                "4 dried guajillo chile peppers or dried red New Mexico chile peppers, stemmed\n" +
                "2 cups chicken stock\n" +
                "1 tablespoon olive or vegetable oil\n" +
                "Generous pinch saffron\n" +
                "Kosher salt and freshly ground pepper\n" +
                "2 cloves garlic, finely chopped\n" +
                "1 small to medium onion, chopped \n"+
                "Directions \n"+
                "For the rice: Heat the butter in a saucepan over medium heat. Add the pasta and toast until golden. Grate the garlic, onion and tomato into the pan. Stir in the rice, then add the stock and saffron and season with salt and pepper. Bring to a boil, then reduce the heat to a simmer, cover and cook until the liquid has been absorbed and the rice is tender, about 18 minutes. Fluff with a fork and remove from the heat.\n" +
                "\n" +
                "For the enchilada sauce: Toast the dried chile peppers in a skillet or saucepan over medium heat, pressing flat with a metal spatula and turning occasionally, 1 to 2 minutes. Add the stock and simmer until the chiles are soft. Transfer the chiles and stock to a food processor and puree until smooth. Wipe out the skillet and return to the heat. Add the oil, garlic and onions and cook until soft. Add the bay leaf, cinnamon stick, tomato sauce and chile puree and simmer until slightly thickened, 15 to 20 minutes. Stir in the almonds and remove from the heat. \n" +
                "\n" +
                "For the enchiladas: Preheat the oven to 400 degrees F. Heat the oil in a nonstick skillet over medium-high heat. Add the ground chicken and cook, crumbling with a wooden spoon, until browned. Stir in the coriander, cumin and paprika and season with salt and pepper. \n" +
                "\n" +
                "Dip a warm tortilla in the sauce, fill with some of the rice and chicken and roll up. Place the enchilada seam-side down in a casserole dish. Repeat with the remaining tortillas. \n" +
                "\n" +
                "Pour the remaining sauce over the enchiladas in an even layer. Bake until heated through, 30 to 35 minutes. Top with the queso fresco and cilantro."
                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.chickenenchiladas);
    }

    public void mon4()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Green Enchiladas with Chicken \n \n Ingredients: \n" +
                "Two 6-ounce boneless, skinless chicken breasts, trimmed\n" +
                "1/2 cup kosher salt \n" +
                "1 bay leaf\n" +
                "Green Sauce:\n" +
                "1 pound tomatillos, sliced in half\n" +
                "3 to 4 sprigs fresh cilantro \n" +
                "2 jalapenos, seeded and sliced \n" +
                "2 garlic cloves \n" +
                "1 lime, sliced in half \n" +
                "1 large white onion, roughly chopped\n" +
                "1 teaspoon coriander \n"+
                "Directions \n"+
                "For the poached chicken: Add 8 cups water, the chicken, salt and bay leaf to a large saucepan and bring to a boil. Reduce the heat to low, cover and cook for 10 to 12 minutes. Remove the chicken from the water and let sit until cool enough to handle. Shred or slice the chicken thinly and set aside.\n" +
                "\n" +
                "For the green sauce: Preheat the oven to 450 degrees F.\n" +
                "\n" +
                "Place the tomatillos, cilantro sprigs, jalapenos, garlic, lime and white onions on a baking sheet and roast until the tomatillos pierce easily with a fork, 15 to 20 minutes. Transfer the roasted ingredients, except for the lime, to a blender. Squeeze the juice from the roasted lime into the blender and discard the rinds. Add the coriander, cumin, salt and sugar and blend until the sauce is smooth. If the sauce is too thick, add 1/2 cup of water at a time until the desired consistency is reached. Set aside.\n" +
                "\n" +
                "Reduce the oven temperature to 375 degrees F.\n" +
                "\n" +
                "For the enchiladas: To assemble, pour 1 cup of the green sauce on the bottom of a 9-by-13-inch baking dish.\n" +
                "\n" +
                "On a work surface, fill a tortilla with some of the poached chicken and about 2 tablespoons total of the Cheddar and Monterey Jack. Roll the tortilla like a cigar and lay in the baking dish seam-side down on top of the sauce. Continue filling and rolling the tortillas until the dish is full. Pour the remaining sauce on top of the rolled tortillas. Cover with the remaining shredded Cheddar and Monterey Jack and the queso fresco.\n" +
                "\n" +
                "Bake until the cheese is bubbling and melted, 15 to 20 minutes. Garnish with scallions and radishes."
                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.greenenchiladaswithchicken);
    }

    public void mon5()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Enchiladas Colorado \n \n Ingredients: \n" +
                "1 pound bone-in skinless chicken thighs (about 4 thighs)\n" +
                "2 cups low-sodium chicken broth\n" +
                "2 teaspoons salt\n" +
                "2 cloves garlic\n" +
                "1/2 medium white onion, quartered\n" +
                "Colorado Sauce:\n" +
                "4 dried ancho chiles, halved, stemmed and seeded\n" +
                "4 dried New Mexico chiles, halved, stemmed and seeded\n" +
                "1 1/2 cups boiling water\n" +
                "1 tablespoon vegetable oil \n"+
                "Directions \n"+
                "For the tortillas: Combine the masa, water, shortening and salt in a bowl. Bring the mixture together with your hands and make into a uniform disc. Wrap the disk in plastic wrap and let rest at room temperature for about 20 minutes. \n" +
                "\n" +
                "Preheat a large cast-iron pan over high heat. Line the tortilla press with parchment paper. \n" +
                "\n" +
                "Portion the dough into golf-ball-size balls, about 1 1/2 ounces each. Place 1 ball at a time into the tortilla press between two sheets of parchment paper. Press down on the tortilla press. Carefully, peel away one sheet of the parchment. Flip the exposed side of the tortillas onto your hand and carefully remove the other side of the parchment. Place the tortilla directly onto the preheated skillet. Cook until the edges begin to curl and bumps form, 1 to 2 minutes. Flip and cook the other side, 1 to 2 minutes. Repeat with the remaining tortillas. \n" +
                "\n" +
                "For the enchiladas: Combine the chicken, chicken broth, salt, garlic and onions in a large saucepan over high heat. Bring to a boil, and then reduce the heat, cover with a lid and simmer until the chicken is fully cooked, about 20 minutes. Remove the chicken and set aside to cool. When cool enough to handle, shred the chicken and set aside. \n" +
                "\n" +
                "For the Colorado sauce: Heat a medium skillet over medium-high heat. Toast the chiles skin-side up until fragrant and beginning to darken, 30 seconds to 1 minute. \n" +
                "\n" +
                "Transfer the chiles to a bowl and pour over the boiling water, or enough to cover the chilies; soak until softened, about 15 minutes. Transfer the chiles and steeping liquid to the bowl of a food processor. Pulse until a smooth paste forms. \n" +
                "\n" +
                "Heat the vegetable oil in a saucepan over medium heat. Add the coriander, cumin, garlic and onions and cook until softened and fragrant, 6 to 8 minutes. Whisk in the blended chile paste and bring to a simmer. Cook until slightly reduced and flavors are developed, 4 to 6 minutes. Sprinkle with salt and black pepper. Set aside. \n" +
                "\n" +
                "For assembly: Pour 1/4 inch vegetable oil into a large frying pan over medium-high heat. Soften the tortillas one at a time in the hot oil, about 5 seconds. Set each tortilla on a paper towel afterwards to soak up some of the oil. \n" +
                "\n" +
                "To assemble the enchiladas, dip a softened tortilla in simmering Colorado sauce and place on a work surface. Add 2 tablespoons shredded chicken and 1 tablespoon Colorado sauce. Roll up tightly and place on a serving platter. \n" +
                "\n" +
                "Top the enchiladas with crumbled queso fresco, onions and cilantro. Drizzle with some crema, if using, and serve immediately."
                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.enchiladascolorado);
    }

    public void mon6()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Olga Gonzalez's Enchiladas with Red Sauce \n \n Ingredients: \n" +
                "2 pounds boneless, skinless chicken thighs\n" +
                "Enchilada Filling:\n" +
                "2 pounds boneless, skinless chicken thighs\n" +
                "Enchilada Sauce:\n" +
                "1 pound dried California chiles, stemmed and seeded*\n" +
                "2 teaspoons dried Mexican oregano*\n" +
                "1 teaspoon salt \n" +
                "1 clove garlic\n" +
                "Enchilada Sauce:\n" +
                "1 pound dried California chiles, stemmed and seeded*\n" +
                "2 teaspoons dried Mexican oregano* \n"+
                "Directions \n"+
                "For the filling: In a 3-quart saucepot, add the chicken thighs and 4 cups of water. Bring to a boil, and then reduce the heat to a simmer. Cover and simmer until the chicken is cooked through, about 20 minutes. Remove the chicken and set aside to cool. Reserve the cooking liquid for the enchilada sauce. When cool enough to handle, shred the chicken and set aside.\n" +
                "\n" +
                "For the sauce: Heat a 6-quart stock pot over medium-high heat, add the chiles and the reserved cooking liquid. Bring to a boil, then reduce the heat to a simmer, and cook until chiles are soft, about 20 minutes. In a blender, add the rehydrated chiles and cooking liquid, the oregano, salt and garlic, and puree until smooth. Set aside.\n" +
                "\n" +
                "For the enchiladas: Heat a 10-inch skillet over medium-high heat and add enough oil until it comes 1/2-inch up the sides of the skillet. Dip one tortilla at a time into the enchilada sauce, coating both sides. When the oil begins to shimmer, gently lay the tortilla into skillet and cook 1 to 2 minutes on each side, turning carefully with tongs, being careful as hot oil will spatter. Remove the tortilla from the oil and lay on a paper-towel-lined plate to absorb some of the oil. Repeat for the remaining tortillas.\n" +
                "\n" +
                "Working with two tortillas at a time, spoon 2 tablespoons of the shredded chicken, 1 tablespoon diced onions and 2 tablespoons mozzarella down the center of each tortilla. Roll up each tortilla tightly and portion 2 enchiladas per plate. Top each serving with 1 tablespoon queso fresco, 1/4 cup shredded lettuce, 3 tomato slices, 3 avocado slices, 3 olives and finish with a generous dollop of sour cream. Repeat for the remaining tortillas. Serve immediately.\n" +
                "\n" +
                "Enchiladas:\n" +
                "For the filling: In a 3-quart saucepot, add the chicken thighs and 4 cups of water. Bring to a boil, and then reduce the heat to a simmer. Cover and simmer until the chicken is cooked through, about 20 minutes. Remove the chicken and set aside to cool. Reserve the cooking liquid for the enchilada sauce. When cool enough to handle, shred the chicken and set aside.\n" +
                "\n" +
                "For the sauce: Heat a 6-quart stock pot over medium-high heat, add the chiles and the reserved cooking liquid. Bring to a boil, then reduce the heat to a simmer, and cook until chiles are soft, about 20 minutes. In a blender, add the rehydrated chiles and cooking liquid, the oregano, salt and garlic, and puree until smooth. Set aside.\n" +
                "\n" +
                "For the enchiladas: Heat a 10-inch skillet over medium-high heat and add enough oil until it comes 1/2-inch up the sides of the skillet. Dip one tortilla at a time into the enchilada sauce, coating both sides. When the oil begins to shimmer, gently lay the tortilla into skillet and cook 1 to 2 minutes on each side, turning carefully with tongs, being careful as hot oil will spatter. Remove the tortilla from the oil and lay on a paper-towel-lined plate to absorb some of the oil. Repeat for the remaining tortillas.\n" +
                "\n" +
                "Working with two tortillas at a time, spoon 2 tablespoons of the shredded chicken, 1 tablespoon diced onions and 2 tablespoons mozzarella down the center of each tortilla. Roll up each tortilla tightly and portion 2 enchiladas per plate. Top each serving with 1 tablespoon queso fresco, 1/4 cup shredded lettuce, 3 tomato slices, 3 avocado slices, 3 olives and finish with a generous dollop of sour cream. Repeat for the remaining tortillas. Serve immediately."
                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.olgagonzalezsenchiladaswithredsauce);
    }

    public void mon7()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Spicy Mexican Hot Chocolate Cookies \n \n Ingredients: \n" +
                "1 stick (4 ounces) unsalted butter\n" +
                "4 ounces good-quality unsweetened chocolate, coarsely chopped\n" +
                "1 cup packed light brown sugar\n" +
                "1/2 cup granulated sugar\n" +
                "2 teaspoons pure vanilla extract\n" +
                "2 large eggs\n" +
                "1 cup all-purpose flour\n" +
                "1/2 cup unsweetened cocoa powder\n" +
                "1 tablespoon ground cinnamon\n" +
                "1 teaspoon chili powder\n" +
                "1/2 teaspoon baking soda\n" +
                "1/2 teaspoon kosher salt\n" +
                "1/4 teaspoon cayenne pepper\n" +
                "1 cup semisweet chocolate chips \n"+
                "Directions \n"+
                "In a heatproof bowl set over simmering water, melt the butter and chocolate together, whisking until glossy and smooth. Alternately, the butter and chocolate can be melted in the microwave (in a microwave-safe bowl) in 25-second increments, whisking between each interval. Cool the chocolate mixture to room temperature. \n" +
                "\n" +
                "In the bowl of a stand mixer fitted with the paddle attachment (or a hand-held mixer), beat the brown sugar, granulated sugar, vanilla extract and eggs on low speed until well combined. Pour in the cooled chocolate and continue to mix until the ingredients are evenly distributed. \n" +
                "\n" +
                "In a medium bowl sift together the flour, cocoa powder, cinnamon, chili powder, baking soda, salt and cayenne pepper. Add the dry ingredients to the chocolate batter and mix on low speed until just combined and no visible flour remains. Fold in the chocolate chips with a rubber spatula or wooden spoon. \n" +
                "\n" +
                "Working in two batches, scoop 12 balls of dough (preferably using a small ice cream scoop with a spring handle, about 1 1/2 tablespoon size) onto a parchment-lined sheet pan, leaving at least 1 1/2 inches of space between each cookie. Bake the cookies, one pan at a time, for approximately 14 minutes, rotating the pan halfway through cooking time. The cookies should be puffy and still fairly soft when removed from the oven. \n" +
                "\n" +
                "Immediately slide the cookies, still on the parchment paper, onto a wire cooling rack. Cool just a bit before serving, 5 to 10 minutes. Cookies can be stored in airtight container for up to three days, but I prefer them on the day they are baked."
                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.spicymexicanhotchocolatecookies);
    }

    public void mon8()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Delmonico Chicken Clemenceau \n \n Ingredients: \n" +
                "1 fryer, about 3 1/2 pounds\n" +
                "Drizzle of olive oil\n" +
                "Salt\n" +
                "Freshly ground black pepper\n" +
                "1 tablespoon butter\n" +
                "1/2 pound Smithfield Ham, julienned\n" +
                "1/2 cup minced onions\n" +
                "2 teaspoons chopped garlic\n" +
                "1/2 pound assorted Exotic mushrooms, stemmed, cleaned and sliced\n" +
                "1/2 pound green peas\n" +
                "1/2 pound brabant potatoes (small diced blanched potatoes that are fried until golden)\n" +
                "3 tablespoons white vinegar\n" +
                "3 tablespoons white wine\n" +
                "10 peppercorns, crusted\n" +
                "2 tablespoons finely chopped shallots\n" +
                "1 tablespoon chopped tarragon \n"+
                "Directions \n"+
                "Preheat the oven to 400 degrees F. Season the chicken with olive oil, salt and pepper. Place on a roasting pan and bake for 30 minutes. Reduce the heat to 350 degrees F. and continue to cook for 30 minutes. In a large saute pan, melt the butter. Add the ham and saute for 2 minutes. Add the onions. Saute for 1 minute. Add the garlic and mushrooms. Season with salt and pepper. Saute for 2 minutes. Add the peas and potatoes. Saute for 3 to 4 minutes. In a saucepan, combine the vinegar, wine, peppercorns, shallots, and tarragon. Bring the liquid to a boil and reduce to 1 tablespoon. Add 1 tablespoon of water. Add the egg yolks and whisk, over low heat, until frothy, about 3 to 4 minutes. In a steady stream, add the butter until the sauce thickens. Season with salt and pepper. Strain the sauce through a chinois and set aside. Remove the chicken from the oven and carve into 4 pieces (2 breast and 2 leg/thigh). To serve, spoon the potato mixture on the bottom of each plate. Lay the individual chicken portions on top of the potatoes. Spoon the Bernaise Sauce over the chicken and serve."


                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.delmonicochickenclemenceau);
    }
    public void mon9()
    {
        TextView txt=findViewById(R.id.congthuc);

        String congthucstr="Spaghetti and Turkey Meatballs \n \n Ingredients: \n" +
                "1/2 cup old-fashioned oats\n" +
                "1/4 cup milk \n" +
                "1/2 yellow onion, finely chopped \n" +
                "1/2 cup fresh baby spinach leaves, chopped \n" +
                "1/4 cup grated Parmesan\n" +
                "1 teaspoon kosher salt \n" +
                "1/2 teaspoon freshly ground black pepper \n" +
                "2 cloves garlic, grated \n" +
                "1 large egg \n" +
                "1 pound ground turkey \n" +
                "4 to 8 tablespoons grapeseed oil \n"+
                "Directions \n"+
                "For the turkey meatballs: Add the oats to a food processor and pulse a few times. The consistency should resemble breadcrumbs. Add the oats and milk to a small bowl and set aside for 5 minutes.\n" +
                "\n" +
                "Add the onions, spinach, Parmesan, salt, pepper, garlic and egg to a large bowl and mix well. Add the oat mixture and combine. Lastly, add the turkey and gently fold into the wet mixture. Keep the mixture light by not over-mixing. Form into bite-size balls using a small cookie scoop for uniform meatballs.\n" +
                "\n" +
                "Heat 4 tablespoons of the oil in a large Dutch oven over medium heat. Add half of the meatballs and brown on all sides, 5 to 7 minutes. Remove and repeat with the second batch, adding more oil if needed. Set the meatballs aside but reserve the Dutch oven for the sauce.\n" +
                "\n" +
                "For the quick marinara sauce: Add the tomatoes, tomato paste, oregano, salt, pepper and garlic to the Dutch oven and stir. Bring to a boil. Reduce the heat, cover and let simmer for about 10 minutes. Gently add the browned meatballs to the sauce. Do not overcrowd. Simmer until the meatballs are cooked thoroughly, another 10 to 15 minutes. If making the optional spicy version, add the red wine and chile flakes in the last 2 minutes of cooking.\n" +
                "\n" +
                "Bring a large pot of water to a boil. Season with a generous pinch of salt. Add the spaghetti and cook until al dente, about 8 minutes.\n" +
                "\n" +
                "Combine some of the sauce with the cooked spaghetti. Plate the spaghetti and meatballs and add the remaining sauce over everything. Garnish with parsley, basil and grated Parmesan. Serve hot."
                ;
        txt.setText(congthucstr);

        ImageView asd=findViewById(R.id.imageView11);
        asd.setImageResource(R.drawable.spaghettiandturkeymeatballs);
    }
}
