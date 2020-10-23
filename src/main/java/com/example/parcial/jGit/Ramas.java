package com.example.parcial.jGit;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.PushCommand;
import org.eclipse.jgit.api.RemoteAddCommand;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.internal.storage.file.FileRepository;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.transport.URIish;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class Ramas {
    public static void Rama() throws IOException, GitAPIException, URISyntaxException {
        for (int x = 0; x <= 5; x++) {

            switch(x){

                case 1:try {
                    String repoPath = "https://github.com/SPAB-UTN/Parcial.git";
                    String localPath = "D:\\Documentos\\UTN - Programación\\3° Semestre\\parcial";
                    Repository localRepo = new FileRepository(localPath);


                    try (Git git = Git.init().setDirectory(new File(localPath)).call()) {


                        git.checkout()
                                .setCreateBranch(true)
                                .setName("Entities")
                                .call();

                        // Repositorio remoto
                        RemoteAddCommand remoteAddCommand = git.remoteAdd();
                        remoteAddCommand.setName("origin");
                        remoteAddCommand.setUri(new URIish(repoPath));
                        remoteAddCommand.call();

                        // Push
                        PushCommand push = git.push();
                        push.setCredentialsProvider(new UsernamePasswordCredentialsProvider("SPAB-UTN", "cursadoutn1"));
                        push.call();
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                    break;

                case 2:try {
                    String repoPath = "https://github.com/SantiagoAguilar1/Prueba.git";
                    String localPath = "C:\\Users\\MegaTecnologia\\Desktop\\PruebaDef";
                    Repository localRepo = new FileRepository(localPath);


                    try (Git git = Git.init().setDirectory(new File(localPath)).call()) {


                        git.checkout()
                                .setCreateBranch(true)
                                .setName("Repositories")
                                .call();

                        // Repositorio remoto
                        RemoteAddCommand remoteAddCommand = git.remoteAdd();
                        remoteAddCommand.setName("origin");
                        remoteAddCommand.setUri(new URIish(repoPath));
                        remoteAddCommand.call();

                        // Push
                        PushCommand push = git.push();
                        push.setCredentialsProvider(new UsernamePasswordCredentialsProvider("SPAB-UTN", "cursadoutn1"));
                        push.call();
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                    break;

                case 3:try {
                    String repoPath = "https://github.com/SantiagoAguilar1/Prueba.git";
                    String localPath = "C:\\Users\\MegaTecnologia\\Desktop\\PruebaDef";
                    Repository localRepo = new FileRepository(localPath);


                    try (Git git = Git.init().setDirectory(new File(localPath)).call()) {


                        git.checkout()
                                .setCreateBranch(true)
                                .setName("Services")
                                .call();

                        // Repositorio remoto
                        RemoteAddCommand remoteAddCommand = git.remoteAdd();
                        remoteAddCommand.setName("origin");
                        remoteAddCommand.setUri(new URIish(repoPath));
                        remoteAddCommand.call();

                        // Push
                        PushCommand push = git.push();
                        push.setCredentialsProvider(new UsernamePasswordCredentialsProvider("SPAB-UTN", "cursadoutn1"));
                        push.call();
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                    break;

                case 4:try {
                    String repoPath = "https://github.com/SantiagoAguilar1/Prueba.git";
                    String localPath = "C:\\Users\\MegaTecnologia\\Desktop\\PruebaDef";
                    Repository localRepo = new FileRepository(localPath);


                    try (Git git = Git.init().setDirectory(new File(localPath)).call()) {


                        git.checkout()
                                .setCreateBranch(true)
                                .setName("Controllers")
                                .call();

                        // Repositorio remoto
                        RemoteAddCommand remoteAddCommand = git.remoteAdd();
                        remoteAddCommand.setName("origin");
                        remoteAddCommand.setUri(new URIish(repoPath));
                        remoteAddCommand.call();

                        // Push
                        PushCommand push = git.push();
                        push.setCredentialsProvider(new UsernamePasswordCredentialsProvider("SPAB-UTN", "cursadoutn1"));
                        push.call();
                    }
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                    break;

            }
        }
    }
}
