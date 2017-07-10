# Maven playground

Plays with maven-release-plugin in a DVCS context.

## Principle

`master` is the main branch. All development are done through _feature branches_, which are merged in `master` after review.

On release, the `maven-release-plugin` is executed on `master` :
```
mvn release:prepare
mvn release:perform
mvn clean
```

After that :
- A tag has been pushed to Github
- The release zip is available at Github
- The main branch is ready for further development

Then, the code can be merged in "environment branches",`staging` and `production` for example. It is better to merge the tag :
```
git checkout staging|production
git merge <tag>
```

## Conclusion

- `master` contains the code history
- `staging` and `production` contains the deployment history