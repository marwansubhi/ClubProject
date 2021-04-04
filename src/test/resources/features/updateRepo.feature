@test
Feature: As a user, I should be able to rename only my own repository

#  Background:



  Scenario Outline:
    Given user is successfully logged in and authorized


    When user is sending update end point"PATCH repos{owner}{repo}",with new name "<old>"

    Then the patch should be processed successfully with the status code 200 and new name is "<new>"

    Examples:

      | old              | new              |
      | complexity.wmlsc | complexity.wmlsc |
      | my-new-repo-name            | my-new-repo-name            |
      | AyseRepo         | AyseRepo         |
      | EsmaRepo         | EsmaRepo         |
      | VadymRepo        | VadymRepo        |
      | myRepo           | myRepo           |